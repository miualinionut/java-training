package code._3_in_class;

import java.io.FileInputStream;
import java.io.IOException;

public class DemoException {

    public int divide(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }

    public int divideTryAndFinally(int firstNumber, int secondNumber) {
        try {
            System.out.println("start try block");
/*
            if (secondNumber % 2 == 0) {
                throw new MyException("Exceptia mea");
            }
*/

            return firstNumber / secondNumber;
        } catch (ArithmeticException e) {
//            e.printStackTrace();
            System.out.println("ArithmeticException catch");
            System.out.println(e.toString());
        } finally {
            System.out.println("finally call");
        }

        return 0;
    }

    public void demoSuppressedException(String filePath) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileInputStream.close();
        }
    }
}
