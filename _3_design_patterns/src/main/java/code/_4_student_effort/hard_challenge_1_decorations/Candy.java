package code._4_student_effort.hard_challenge_1_decorations;

public class Candy extends Decorations{

    public Candy(int rowInTree, DecorableTree tree){
        super(rowInTree, tree);
    }

    @Override
    public String getDecoration() {
        return "C";
    }
}
