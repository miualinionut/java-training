package code._4_student_effort.Decorations;

public class Candy extends TreeDecorator{

    public Candy(int positionInTree, DecorableTree tree) {
        super (positionInTree, tree);
    }
    @Override
    public String getDecoration() {
        return "C";
    }
}
