package code._4_student_effort.HardCodeChallange1;

public class DecorationBulb extends Decoration{
    public DecorationBulb(int rowInTree, DecorableTree christmasTree){
        super(rowInTree, christmasTree);
    }

    @Override
    public String getDecoration() {
        return "B";
    }
}
