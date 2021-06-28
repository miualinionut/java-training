package code._4_student_effort;

import java.lang.reflect.InvocationTargetException;

public class Main {

  public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException
  {
    codeChallenge1();
  }

  private static void codeChallenge1() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException
  {
    ExchangeDesk exchangeDesk = new ExchangeDesk();
    Ron lion = new Ron();
    lion.setSum(1_000);

//    exchangeDesk.addRate(Ron.class, Usd.class, 2.0d);

    Usd dollar = exchangeDesk.convert(lion, Usd.class);
    System.out.println(dollar.getSum() == -1 ? "Unsupported conversion" : dollar.getSum());

    exchangeDesk.addRate(Ron.class, Usd.class, 4.0d);

    Usd dollar2 = exchangeDesk.convert(lion, Usd.class);
    System.out.println(dollar2.getSum());
  }
}
