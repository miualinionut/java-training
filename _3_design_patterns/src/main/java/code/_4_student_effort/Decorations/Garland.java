package code._4_student_effort.Decorations;

public class Garland extends TreeDecorator {
    public Garland(int positionInTree, DecorableTree tree){
        super (positionInTree, tree);
    }
    @Override
    public String getDecoration() {
        return "G";

    }
}
