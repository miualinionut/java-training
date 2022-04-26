package dao;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.*;
import java.net.ConnectException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import connection.ConnectionFactory;

/**
 * Class used for generic data accress operations.
 * @param <T>
 */
public class AbstractDAO<T> {
    protected static final Logger LOGGER = Logger.getLogger(AbstractDAO.class.getName());

    private final Class<T> type;

    /**
     * Constructor for initializing the generic type.
     */
    @SuppressWarnings("unchecked")
    public AbstractDAO() {
        this.type = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

    }

    /**
     * Method that creates a select query based on String field.
     * @param field
     * @return
     */
    private String createSelectQuery(String field) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append(" * ");
        sb.append(" FROM ");
        sb.append(type.getSimpleName());
        sb.append(" WHERE " + field + " =?");
        return sb.toString();
    }

    /**
     * Method that creates a Delete query based on String field.
     * @param field
     * @return
     */
    private String createDeleteQuery(String field){
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE ");
        sb.append(" FROM ");
        sb.append(type.getSimpleName());
        sb.append(" WHERE " + field + " = ?;");
        return sb.toString();
    }

    /**
     * Method that creates an Insert query based on the parameters of object t.
     * @param t
     * @return
     */
    private String createInsertQuery(T t){
        StringBuilder sb = new StringBuilder();
        Object[] objectValues = getObjectValues(t);
        sb.append("INSERT INTO ");
        sb.append(type.getSimpleName() + "(");
        try{
            Field[] fields = type.getDeclaredFields();
            for(int i =1;i<fields.length;i++){
                if(i == fields.length-1){
                    sb.append(fields[i].getName()+") VALUES (");
                } else {
                    sb.append(fields[i].getName() + ", ");
                }
            }
            for(int i =1;i<fields.length;i++) {
                if (i == fields.length - 1) {
                    if (objectValues[i].getClass().getName().equalsIgnoreCase("Integer")) {
                        sb.append(objectValues[i].toString() + ");");
                    } else {
                        sb.append("\'" + objectValues[i].toString() + "\');");
                    }

                } else {
                    if (objectValues[i].getClass().getName().equalsIgnoreCase("Integer")) {
                        sb.append(objectValues[i].toString() + ", ");
                    } else {
                        sb.append("\'" + objectValues[i].toString() + "\', ");
                    }
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return sb.toString();
    }

    /**
     * Method that creates an update query based on object t.
     * @param t
     * @return
     */
    private String createUpdateQuery(T t){
        Object[] objectValues = getObjectValues(t);
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE " + type.getSimpleName() + " SET ");
        try{
            Field[] fields = type.getDeclaredFields();
            for(int i =1;i<fields.length;i++){
                if(i == fields.length - 1){
                    sb.append(fields[i].getName() + " = ");
                    if(objectValues[i].getClass().getName().equalsIgnoreCase("Integer")){
                        sb.append(objectValues[i].toString() + " ");
                    } else {
                        sb.append("\'" + objectValues[i].toString() + "\' ");
                    }
                } else {
                    sb.append(fields[i].getName() + " = ");
                    if(objectValues[i].getClass().getName().equalsIgnoreCase("Integer")){
                        sb.append(objectValues[i].toString() + ", ");
                    } else {
                        sb.append("\'" + objectValues[i].toString() + "\', ");
                    }
                }
            }
            sb.append(" WHERE " + fields[0].getName() + " = " + objectValues[0].toString()+ ";");
        } catch (Exception e){
            e.printStackTrace();
        }
        return sb.toString();
    }

    /**
     * Method that gets the object types and values of a specific generic object t.
     * @param t
     * @return
     */
    public Object[] getObjectValues(Object t){
        Object[] objectValues=null;
        try{
            Field[] fields= type.getDeclaredFields();
            objectValues = new Object[fields.length];
            for(int i =0; i<fields.length;i++){
                String fieldName = fields[i].getName();
                Method method = type.getDeclaredMethod("get" + fieldName.substring(0,1).toUpperCase() + fieldName.substring(1));
                objectValues[i] = method.invoke(t);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e){
            LOGGER.log(Level.WARNING, type.getName() + "DAO: getObjectValues "+ e.getMessage());
        }
        return objectValues;
    }

    /**
     * Method that returns a list of type T of all the entries in the table.
     * @return
     */
    public List<T> findAll() {
        Connection dbConnection = ConnectionFactory.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        StringBuilder sb = new StringBuilder();
        sb.append(" SELECT ");
        sb.append("*");
        sb.append(" FROM ");
        sb.append(type.getSimpleName() + ";");
        try{
            statement = dbConnection.prepareStatement(sb.toString());
            System.out.println(statement.toString());
            resultSet = statement.executeQuery();
            return createObjects(resultSet);
        }catch (SQLException e ){
            LOGGER.log(Level.WARNING, type.getName() + "DAO: findAll " + e.getMessage());
        } finally {
            ConnectionFactory.close(resultSet);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(dbConnection);
        }
        return null;
    }

    /**
     * Method that finds an entry from the table by its id.
     * @param id
     * @return
     */
    public T findById(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String query=null;
        if(type.getSimpleName().equalsIgnoreCase("Bill")){
            query = createSelectQuery("orderId");
        } else {
            query = createSelectQuery("id");
        }

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            System.out.println(statement.toString());
            resultSet = statement.executeQuery();
            System.out.println(resultSet);
            if(resultSet != null){
                return createObjects(resultSet).get(0);
            } else {
                return null;
            }

        } catch (SQLException | IndexOutOfBoundsException e) {
            LOGGER.log(Level.WARNING, type.getName() + "DAO:findById " + e.getMessage());
        } finally {
            ConnectionFactory.close(resultSet);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
        return null;
    }

    /**
     * Method that creates a list of objects from a ResultSet.
     * usually used when displaying queries.
     * @param resultSet
     * @return
     */
    private List<T> createObjects(ResultSet resultSet) {
        List<T> list = new ArrayList<T>();
        Constructor[] ctors = type.getDeclaredConstructors();
        Constructor ctor = null;
        for (int i = 0; i < ctors.length; i++) {
            ctor = ctors[i];
            if (ctor.getGenericParameterTypes().length == 0)
                break;
        }
        try {
            while (resultSet.next()) {
                ctor.setAccessible(true);
                T instance = (T)ctor.newInstance();
                for (Field field : type.getDeclaredFields()) {
                    String fieldName = field.getName();
                    Object value = resultSet.getObject(fieldName);
                    PropertyDescriptor propertyDescriptor = new PropertyDescriptor(fieldName, type);
                    Method method = propertyDescriptor.getWriteMethod();
                    method.invoke(instance, value);
                }
                list.add(instance);
            }
        } catch (InstantiationException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | IntrospectionException | SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * Method that add a new entry in the table.
     * @param t
     * @return
     */
    public int insert(T t) {
        Connection dbConnection = ConnectionFactory.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        int insertedId=-1;
        String insertTemp = createInsertQuery(t);
        try {
            statement = dbConnection.prepareStatement(insertTemp, Statement.RETURN_GENERATED_KEYS);
            System.out.println(statement.toString());
            statement.executeUpdate();
            resultSet = statement.getGeneratedKeys();
            if(resultSet.next()){
                insertedId = resultSet.getInt(1);
            }
        } catch (SQLException e){
            LOGGER.log(Level.WARNING, type.getName() + "DAO: insert " + e.getMessage());
        } finally {
            ConnectionFactory.close(resultSet);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(dbConnection);
        }
        return insertedId;
    }

    /**
     * Method that updates an entry in the table based on its id.
     * @param t
     * @return
     */
    public int update(T t) {
        Connection dbConnection = ConnectionFactory.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet=null;
        int updatedId=-1;
        String updateTemp = createUpdateQuery(t);
        try{
            statement = dbConnection.prepareStatement(updateTemp);
            System.out.println(statement.toString());
            updatedId = statement.executeUpdate();
        } catch (SQLException e){
            LOGGER.log(Level.WARNING, type.getName() + "DAO: insert " + e.getMessage());
        } finally {
            ConnectionFactory.close(resultSet);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(dbConnection);
        }
        return updatedId;
    }

    /**
     * Method that deletes an entry from the table based on its id.
     * @param id
     * @return
     */
    public int delete(int id){
        Connection dbConnetion = null;
        PreparedStatement statement = null;
        int deleted = -1;
        String query=null;
        if(type.getSimpleName().equalsIgnoreCase("Bill")){
            query = createDeleteQuery("orderId");
        } else {
            query = createDeleteQuery("id");
        }
        //String query = createDeleteQuery("id");
        try{
            dbConnetion = ConnectionFactory.getConnection();
            statement = dbConnetion.prepareStatement(query);
            statement.setInt(1, id);
            System.out.println(statement.toString());
            deleted = statement.executeUpdate();
            return deleted;
        } catch (SQLException e){
            LOGGER.log(Level.WARNING, type.getName() +"DAO: delete " + e.getMessage());
        } finally {
            ConnectionFactory.close(statement);
            ConnectionFactory.close(dbConnetion);
        }
        return deleted;
    }
}
