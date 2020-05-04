package code._4_student_effort.hardChallenge1;

public class Garland extends Decoration {

    public Garland(DecorableTree christmasTree, int row) {
        super(christmasTree, row);
    }

    @Override
    public String getDecoration() {
        return "G";
    }
}
