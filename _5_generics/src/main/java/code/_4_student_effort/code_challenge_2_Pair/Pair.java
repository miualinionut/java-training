package code._4_student_effort.code_challenge_2_Pair;

public class  Pair <L extends Shoe>{
    private Object firstObj;
    private Object secondObj;

    public Pair(L firstObj, L secondObj) {
        if (!firstObj.getColor().equals(secondObj.getColor())) {
            throw new ColorsDoNotMatchException("Colors are not the same");
        }
        if (firstObj.getSize() != secondObj.getSize()) {
            throw new SizesDoNotMatchException("Sizes are not the same");
        }
        this.firstObj = firstObj;
        this.secondObj = secondObj;
    }

    public Object getFirstObj() {
        return firstObj;
    }

    public Object getSecondObj() {
        return secondObj;
    }
}
