package code._3_in_class;

public class Main {

    public static void main(String[] args) {
        method();
        DemoException demoException = new DemoException();
        int result = demoException.divideTryAndFinally(8, 0);
        System.out.println("Result = " + result);

        Student student01 = new Student("ionescu");
        Student student02 = new Student("popescu");

        student01.sayHello();
        student02.sayHello();
    }

    private static void method() {
        DemoException demoException = new DemoException();
        int result;
        try {
            result = demoException.divide(8, 0);
            System.out.println("Result = " + result);
        }
        /** | this is how u catch multiple exceptions to have the same handling*/
        catch (ArithmeticException | NumberFormatException e) {
            // e.printStackTrace();
            System.out.println("You can t divide by 0");
        }
    }

    // CO-VARIANTA
    // COntra-VARIANTA / INTRAVARIANTA
}

