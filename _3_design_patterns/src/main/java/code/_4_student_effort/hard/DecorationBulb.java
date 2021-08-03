package code._4_student_effort.hard;

public class DecorationBulb extends Decoration {
    public DecorationBulb(int positionInTree, DecorableTree christmasTree) {
        super(positionInTree, christmasTree);
    }
    @Override
    public String getDecoration() {
        return "B";
    }
}
