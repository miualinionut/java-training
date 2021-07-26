package code._4_student_effort.HardCodeChallange1;

public class DecorationGarland extends Decoration{
    public DecorationGarland(int rowInTree, DecorableTree treeToDecorate) {
        super(rowInTree, treeToDecorate);
    }

    @Override
    public String getDecoration() {
        return "G";
    }
}
