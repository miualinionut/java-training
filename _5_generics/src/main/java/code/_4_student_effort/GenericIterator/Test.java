package code._4_student_effort.GenericIterator;
import  code._4_student_effort.GenericLinkedList.*;

import java.awt.*;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        Integer arr[] = new Integer[]{1,2,3,4};
        IArrayIterator<Integer> iterator= new GenericIterator<>(arr);

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Stage 2 - requirments:
        Persoana p1 = new Persoana("Andreea",21);
        Persoana p2 = new Persoana("Andrei",30);

        int nrPers = 0;
        Persoana[] lista = new Persoana[5];
        lista[0] = p1;
        lista[1] = p2;

        IArrayIterator<Persoana> iteratorPersoane = new GenericIterator<Persoana>(lista);
        while (iteratorPersoane.hasNext()){
            System.out.println(iteratorPersoane.next());
        }
    }
}
