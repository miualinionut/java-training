package code._4_student_effort.GenericLinkedList;

public class Main {

    public static void main(String[] args) {
        String rootValue = "a";
        Persoana p1 = new Persoana("Andreea",21);
        Persoana p2 = new Persoana("Andrei",30);

        //ca sa putem face lista cu obiecte de orice tip(de exemplu cu persoane), trebuie ca listaGenerica sa aiba elemente care implementeaza NodulGeneric
        GenericList<Persoana> listaPers = new GenericList<>();
        listaPers.insert(p1);
        listaPers.insert(p2);
        listaPers.println();
        System.out.println(listaPers.getLength());
    }
}
