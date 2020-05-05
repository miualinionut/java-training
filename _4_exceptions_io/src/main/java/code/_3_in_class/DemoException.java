package code._3_in_class;

import javax.print.attribute.standard.Fidelity;
import java.io.FileInputStream;
import java.io.IOException;

public class DemoException{
    public static int divide(int firstNumber, int secondNumber) throws Exception{
        return firstNumber/secondNumber;
    }

    public int divideWithTryAndFinally(int First, int Second){
        try{
            return First/Second;
        } catch(ArithmeticException exception){
            System.out.println(exception.toString());
        }
        finally {
            System.out.println("finally");
        }
        return 0;
    }

    public void demoSupressed(String filePath){
        FileInputStream fileInputStream = null;
        try{
            fileInputStream = new FileInputStream(filePath);
        }catch(IOException exception){
            exception.printStackTrace();
        } finally {
           // fileInputStream.close(); //ignora restul de exceptii
        }
        
    }
}
