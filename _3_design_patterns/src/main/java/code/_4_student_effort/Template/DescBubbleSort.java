package code._4_student_effort.Template;

public class DescBubbleSort extends TemplateMethodBubbleSort {

    @Override
    boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        if(i1 < i2) return false;
        return true;
    }
}
