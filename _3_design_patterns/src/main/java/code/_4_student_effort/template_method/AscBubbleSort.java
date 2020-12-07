package code._4_student_effort.template_method;

public class AscBubbleSort extends TemplateMethodBubbleSort {

    @Override
    boolean numberInCorrectOrder(Integer i1, Integer i2) {
        return i1<i2;
    }
}
