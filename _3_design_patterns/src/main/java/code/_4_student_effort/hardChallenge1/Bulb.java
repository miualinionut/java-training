package code._4_student_effort.hardChallenge1;

import java.util.List;

public class Bulb extends Decoration{


    public Bulb(DecorableTree christmasTree, int row) {
        super(christmasTree, row);
    }

    @Override
    public String getDecoration() {
        return "B";
    }

}
