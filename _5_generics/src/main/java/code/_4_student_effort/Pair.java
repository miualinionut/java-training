package code._4_student_effort;

public class Pair<T extends  Shoes> {
    private final T first;
    private final T second;
    public Pair(T firstElement, T secondElement){
        first = firstElement;
        second = secondElement;
    }

    private void MatchShoes(T first, T second){
        if(first.getSize() != second.getSize())
            throw new SizeDoesNotMatch("Sizes do NOT match!");
        if(!first.getColor().equals(second.getColor()))
            throw new ColorDoesNotMatch("Colors do NOT match!");
    }

    public T getFirst(){
        return first;
    }

    public T getSecond(){
        return second;
    }

    public static void main(String[] args) {
        Running runningShoe1 = new Running("RED",41);
        Running runningShoe2 = new Running("RED",41);
        Pair<Running> pairOK = new Pair<>(runningShoe1,runningShoe2);

        Boots bootShoe1 = new Boots("BLACK", 45);
        Boots bootShoe2 = new Boots("RED", 45);
        Boots bootShoe3 = new Boots("RED", 40);
        //Pair<Running> pairKO = new Pair<>(runningShoe1,bootShoe);
        Pair<Boots> pairColor = new Pair<>(bootShoe1,bootShoe2);
        Pair<Boots> pairColor1 = new Pair<>(bootShoe3,bootShoe2);
    }
}
