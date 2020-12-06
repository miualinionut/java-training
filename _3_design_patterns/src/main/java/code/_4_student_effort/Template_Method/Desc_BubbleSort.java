package code._4_student_effort.Template_Method;

public class Desc_BubbleSort extends TemplateBubbleSort {
    @Override
    public boolean numbersInCorrectOrder(Integer i1, Integer i2) {

        return i1 < i2;
    }
}