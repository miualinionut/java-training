package code._3_in_class;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here

        //notite

        /*
        *
        * -intrebare de interviu - ierarhie de interfete cu list
        * -pentru array avem complexitate O(1)  (random access) si pentru linked list avem complexitate O(n)  (sequantial access)
        * -intrebare de interviu: ai un algoritm de sortare cu array si ai O(n^2). Daca ai o lista inlantuita si vreau sa o sortez este o diferenta de complexitate? -> Da, o sa fie mult mai mult.
        * -intrebare de interviu: diferenta de linked list si arraylist pentru operatiile de adaugare -> adaugarea intr-un arraylist este mai rapida decat in linked list pentru ca nu trebuie sa isi aloce casuta noua de fiecare data.
        * -stergerea dintr-un array list este mult mai mare decat cea dintr-un linked list deoarece trebuie sa stearga si sa mute toata partea din dreapta in stanga cu casuta.
        * -get-ul e f rapid la array list pentru ca sare direct la adresa respectiva.
        *
        * ---------------------------------------------------------------------------------
        *
        * - linked list este o lista dubla inlantuita
        *
        * ------------------------------------------------------------------------------
        *
        * -pe langa colectii, mai exista si MAP
        * -intrebare de interviu - ierarhie de map-uri
        * -map are implementarea HashMap si face o asociere dintr-o cheie si o valoare
        * -pentru fiecare valoare stocata in HashMap va exista un HashCode.
        * -cautarea intr-un HashMap este O(1), ca la array
        * -daca am mai multe elemente pe un HashCode, atunci avem un bucket cu mai multe elemente si complexitatea este O(n) si nu mai are sens sa folosim HashMap
        *
        *
        * -----------------------------------
        *
        * -CONTRACTELE:
        * -obiectele care sunt legate prin equals este obligatoriu sa aiba acelasi hashcode - INTREBARE DE INTERVIU
        * -daca obiectele sunt egale ca si valoare (equals) atunci hashcode-urile trebuie sa fie si ele egale (deoarece hashcode-ul este calculat in functie de valoare)
        * -reciproca nu este valabila
        * -daca 2 obiecte au acelasi hashcode, atunci ele nu sunt neaparat egale ca si valoare, deoarece hashcode-ul este de tip INT si suntem limitati la o valoare maxima Integer.MAX_INT si pot aparea dubluri.
        * -daca avem 2 obiecte cu acelasi hashcode, ii cautam si ii diferentiem cu equals()
        *
        *
        *
        *
        * */
    }
}