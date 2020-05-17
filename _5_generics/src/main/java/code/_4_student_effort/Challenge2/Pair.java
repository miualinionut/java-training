package code._4_student_effort.Challenge2;

import code._2_challenge._2_pairs.Shoe;

class Pair<S extends Shoe> {
    private S first;
    private S second;

    public Pair(S firstElement, S secondElement) {
        first = firstElement;
        second = secondElement;
        // makePair(firstElement, secondElement);
    }

    void makePair(S first, S second){
        if(!first.getClass().equals(second.getClass())){
            throw new ClassesDoNotMatch("It's not the same type of shoe.");
        }
        if(!first.getColor().equals(second.getColor())){
            throw new ColorsDoNotMatch("They have different colours.");
        }
        if(first.getSize()!=second.getSize()){
            throw  new SizesDoNotMatch("The size differs.");
        }



    }
    public S getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}