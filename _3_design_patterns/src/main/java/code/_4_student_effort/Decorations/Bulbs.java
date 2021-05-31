package code._4_student_effort.Decorations;

public class Bulbs extends TreeDecorator {

    public Bulbs(int positionInTree, DecorableTree tree) {
        super (positionInTree, tree);
    }
    @Override
    public String getDecoration() {
        return "B";
    }
}
