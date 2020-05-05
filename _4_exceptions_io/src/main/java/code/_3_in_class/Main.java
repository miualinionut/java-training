package code._3_in_class;

public class Main {

  public static void main(String[] args) {
    DemoException demoException = new DemoException();
    /*int result = 0;
    try{ //in loc sa dea eroare face altceva ce vreau eu
      result = demoException.divide(8, 0);
    } catch(Exception e){
      e.printStackTrace();  //arata partea cu rosu
      System.out.println(e.getMessage());
      result = 10;
    }*/

    int result = demoException.divideWithTryAndFinally(12,3);
    System.out.println(result);
  }

}