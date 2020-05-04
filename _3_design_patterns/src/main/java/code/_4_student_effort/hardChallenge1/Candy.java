package code._4_student_effort.hardChallenge1;

public class Candy extends Decoration {

    public Candy(DecorableTree christmasTree, int row) {
        super(christmasTree, row);
    }

    @Override
    public String getDecoration() {
        return "C";
    }
}
