package code._4_student_effort;

import code._2_challenge._2_pairs.ColorsDoNotMatchException;
import code._2_challenge._2_pairs.SizesDoNotMatchException;

public class Pair <S extends  Shoe> {

    private S first;
    private S second;
    public Pair (S firstElem, S secondElem){
        first = firstElem;
        second = secondElem;
        checkPair(first, second);
    }

    public void checkPair(S firstElem, S secondElem){
        if (firstElem.getColour().equals(secondElem.getColour()) != true)
            throw new ColorsDoNotMatchException("colour mismatch");
        if (firstElem.getSize() != secondElem.getSize())
            throw new SizesDoNotMatchException("size mismatch");
    }
    public Object getFirst(){ return first;}
    public Object getSecond() {return second;}
}
