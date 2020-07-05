package code._3_in_class;

public class Main {

    public static void main(String[] args) {
        DemoException demoException = new demoException();
        int result = 0
        try {
            result = demoException.divide(8, 0);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage()+" |||"+e.toString());
            result = 10;
        }
        System.out.println("Result =" + result);

    }
}