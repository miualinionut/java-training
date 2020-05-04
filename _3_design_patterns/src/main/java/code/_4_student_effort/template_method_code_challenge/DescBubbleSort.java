package code._4_student_effort.template_method_code_challenge;

class DescBubbleSort extends TemplateMethodBubbleSort{

    @Override
    boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        return i1 > i2;
    }
}
