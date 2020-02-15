package code._3_in_class;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

  //REFLECTION
  public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
    //ex de clasa anonima ( care nu are nume)
    MyInterface var = new MyInterface() {
      int x = 0;
      @Override
      public void m() {
        System.out.println("S-a apelat metoda m");
      }
      public void m2() {
        System.out.println("s-a apelat metoda m2");
      }
    };
    //var.m();
    Method[] methods = var.getClass().getMethods();
    methods[0].invoke(var);
    methods[1].invoke(var);
  }
}
interface MyInterface {
  void m();
}