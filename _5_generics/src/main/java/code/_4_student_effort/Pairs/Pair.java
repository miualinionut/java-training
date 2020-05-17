package code._4_student_effort.Pairs;

public class Pair<T extends Shoe> {
    private T pair1;
    private T pair2;

    public Pair(T pair1, T pair2){
        this.pair1 = pair1;
        this.pair2 = pair2;

         if (sameColor() == false)
             throw new ColorsDoNotMatchException();
         if (sameSize() == false)
             throw new SizeDoNotMatchException();
    }

    boolean sameColor(){
        if(pair1.sameColor(pair2.getColor())) return true;
        return false;
    }

    boolean sameSize(){
        if(pair1.sameSize(pair2.getSize())) return true;
        return false;
    }

    public T getPair1(){
        return pair1;
    }

    public T getPair2(){
        return pair2;
    }
}
