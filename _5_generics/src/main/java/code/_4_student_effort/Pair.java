package code._4_student_effort;

public class Pair<S extends Shoe> {

    private S first;
    private S second;
    public Pair(S firstElement, S secondElement){
        first=firstElement;
        second=secondElement;
        match(firstElement,secondElement);
    }

    public void match(S firstElement, S secondElement){
        if(firstElement.getSize() != secondElement.getSize())
            throw new SizesDoNotMatchException("Sizes do not match");
        if(!firstElement.getColor().equals(secondElement.getColor()))
            throw new ColorsDoNotMatchException("Colors do not match");
    }

    public S getFirst(){return first;}
    public S getSecond(){return second;}
}
