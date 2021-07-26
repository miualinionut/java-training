package code._4_student_effort.HardCodeChallange1;

public class DecorationCandy extends Decoration{
    public DecorationCandy(int rowInTree, DecorableTree treeToDecorate) {
        super(rowInTree, treeToDecorate);
    }

    @Override
    public String getDecoration() {
        return "C";
    }
}
