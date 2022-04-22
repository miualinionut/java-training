package clean.code.design_patterns.requirements.Composite;

public class Accountant implements Employee {

    private int ID;
    private String name;
    private double salary;

    public Accountant(int ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;

    }
    @Override
    public Employee getChild(int i){
        return null;
    }
    @Override
    public void modify(Employee employee,Employee newEmployee)
    {
    }

    @Override
    public void addEmployee(Employee newEmployee) {

    }
    @Override
    public void removeEmployee(Employee employee) {

    }


    @Override
    public int getID() {
        return ID;
    }

    @Override
    public String getEmployeesName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }



    @Override
    public void printEmployeesData() {
        System.out.println("------------------------------");
        System.out.println("ID: " + getID());
        System.out.println("Name: " +  getEmployeesName());
        System.out.println("Salary: "+ getSalary());
        System.out.println("------------------------------");
    }

}
