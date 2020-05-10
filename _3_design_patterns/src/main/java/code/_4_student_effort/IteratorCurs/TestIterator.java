package code._4_student_effort.IteratorCurs;

public class TestIterator {

    public static void main(String[] args) {
        ArrayCollectionImpl colectie = new ArrayCollectionImpl();
        colectie.add(3);
        colectie.add(2);
        colectie.add(7);

        ArrayCustomIterator iterator = colectie.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
