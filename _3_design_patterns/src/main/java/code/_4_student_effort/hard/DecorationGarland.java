package code._4_student_effort.hard;

public class DecorationGarland extends Decoration{
    public DecorationGarland(int positionInTree, DecorableTree christmasTree) {
        super(positionInTree, christmasTree);
    }
    @Override
    public String getDecoration() {
        return "G";
    }
}
