package code._2_challenge._5_template_method;

public class AscBubleSort extends TemplateMethodBubleSort {
  @Override
  public boolean numbersInCorrectOrder(Integer i1, Integer i2) {
    return i1 > i2;
  }
}