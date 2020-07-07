package code._4_student_effort;
public class Pair<S extends Shoe> {
    private S first;
    private S second;
    public Pair(S shoe_1, S shoe_2){
        first = shoe_1;
        second = shoe_2;
    }
    private void match(S shoe_1, S shoe_2){
        if(shoe_1.getSize() != shoe_2.getSize()){
            throw new SizesDoNotMatchException("sizes do not match!!!");
        }
        if(!shoe_1.getColor().equals(shoe_2.getColor())){
            throw new ColorsDoNotMatchException("Colors don't match!!!");
        }
    }

    public S getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
