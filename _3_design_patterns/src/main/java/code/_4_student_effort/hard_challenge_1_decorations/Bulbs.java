package code._4_student_effort.hard_challenge_1_decorations;

public class Bulbs extends Decorations{

    public Bulbs(int rowInTree, DecorableTree tree){
        super(rowInTree, tree);
    }

    @Override
    public String getDecoration() {
        return "B";
    }

}
