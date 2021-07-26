package code._4_student_effort.CodeChallange2;

public class Pair <T extends Shoe> {
    private T first;
    private T second;

    public Pair(T firstElement, T secondElement){
        this.first = firstElement;
        this.second = secondElement;
        match(firstElement, secondElement);
    }

    private void match(T firstElement, T secondElement){
        if(firstElement.getColor() != secondElement.getColor()){
            throw new ColorsDoNotMatchException("Colors do not match");
        }
        if(firstElement.getSize() != secondElement.getSize()){
            throw new SizesDoNotMatchException("Sizes do not match");
        }
    }

    public T getFirst(){
        return this.first;
    }

    public T getSecond(){
        return this.second;
    }
}
