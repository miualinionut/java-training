package code._4_student_effort.Challenge8;

public class Test {
    public static void main(String[] args) {

        Object[] lista = new Object[12];
        lista[0] = 2;
        System.out.println(lista.length); // ne arata 12 chiar daca lista are 1 singur element

        MyArrayList<String> myArrayList = new MyArrayListImpl<String>(10);
        System.out.println(myArrayList.size());
        myArrayList.add("unu");
        myArrayList.add("doi");
        myArrayList.add("book");
        myArrayList.add("today");
        System.out.println(myArrayList.get(2));

        myArrayList.remove("today");
        System.out.println(myArrayList.size());
        myArrayList.set(2,"trei");
        System.out.println(myArrayList.get(2));
        System.out.println(myArrayList.get(7));

        myArrayList.set(8, "doi");

    }
}
