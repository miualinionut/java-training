package code._3_in_class;

public class Main2 {
    public static void main(String[] args) {
        Generic<Integer> intObj=new Generic<Integer>(12);
        Generic<String> stringObj=new Generic<String>("hola");
        System.out.println(intObj.getClass().getName());


    }
    static class Generic<T>{
        T obj;
        Generic(T obj){
            this.obj=obj;
        }
        void print(){
            System.out.println(obj);
        }
    }
}
