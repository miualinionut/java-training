package code._4_student_effort._5_template_method_code_challenge;

class AscBubbleSort extends TemplateMethodBubbleSort{

    @Override
    boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        return i1 < i2;
    }
}
