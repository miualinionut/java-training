package code._4_student_effort.challenge5;

public class AscBubbleSort extends TemplateMethodBubbleSort {
    @Override
    boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        if(i1<i2)
        return true;
        return false;
    }
}
