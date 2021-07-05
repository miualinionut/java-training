package code._3_in_class;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here

        //Notite curs

        /*
        *
        * GENERICE - unul dintre cele mai complicate lectii din programare (sa ma documentez mai bine daca nu inteleg pentru ca e complicat)
        *
        * ------------------------------
        *
        * bubble sort are o complexitate de n^2 (complexitate de timp) - time complexity = complexitate ciclomatica (cate cicluri de procesor avem nevoie pentru a face o operatie)
        * space complexity - int[] copy = Arrays.copy(arr)
        *                    daca arr initial avea n elemente in memorie, acum si copia are inca n elemente, deci in total avem o complexitate de 2n elemente in memorie
        *
        * deci time complexity = de cate ori se trece prin ciclul procesorului
        *       space complexity = cat spatiu este folosit in memorie
        *
        * ------------------------------
        *
        * TDD = test driven development
        * BDD = behaviour driven development
        * DDD = domain driven development
        * CPP = copy paste programming
        *
        * OVERLOADING - aceiasi metoda scrisa de 2 ori dar cu parametrii diferiti
        *
        * ---------------------------------
        *
        *toate metodele sunt virtuale, deci pot fi suprascrise
        *           daca nu vrem sa fie suprascrise, le punem final in fata
        *
        *JVM - foloseste tiered compilation
        *                   tiered compilation are: interpreter, compilator1, compilator2, compilator3, compilator4
        *                   interpreter - traduce codul nostru intr-un limbaj ce poate sa fie inteles de procesor
        *                   compilator1 - optimizeaza codul deja tradus
        *                   compilator2 - optimizeaza .....
        *                   compilator3 - .....
        *                   compilator4 - deja optimieaza speculativ
        *
        *
        * ---------------------------------------------------------------------
        *
        * tipurile de date care pot fi generice dar care pot fi folosite si nongeneric se numesc RAWTYPEs
        *
        * ------
        *
        *CONCEPTE DE INTERVIU: type erasure =
        *                       heap pollution = cand sunt mai multe tipuri de obiecte intr-o lista(sau alte colectii) -> greseala
        *
        * */


        //------------------------------------

        A a = new A();
        B b = new B();
        a.m(5);
        a.m((short)5);
        b.m(5);
        b.m((short)5);
    }


    public <T extends Comparable> void sort(T[] list){  //conceptul de generice - ne ajuta sa nu duplicam cod. Putem inlocui T cu orice tip de data (int, short etc). Astfel scriem o singura data metoda si o putem folosi cu mai multe tipuri de date.
        for (int i=0; i<list.length - 1; i++){
            for(int j=i+1; j<list.length; j++){
                if(list[i].compareTo(list[j])>0){
                    T temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}


//overloading - supraincarcare => aici aducem ceva in plus          //polimorfism static -> determina metoda ce va fi apelata in momentul compilarii codului - COMPILE TIME
//overriding - suprascriere => aici inlocuim ceva ce exista         //poliformism dinamic -> in momentul rularii programului. Se creaza Virtual Table in momentul rularii programului. - RUNTIME
class A{
    void m(short i){
        System.out.println("m_short from A");
    }
    void m(int i){  //aici e overloading/supraincarcare
        System.out.println("m_int from A");
    }

    /*void m2(List<Integer>list){}  //signatura: m2_list     //da eroare pentru ca are aceiasi signatura si nu poate sa faca diferenta intre cele doua. Ne limiteaza erasure-ul la overloading
    void m2(List<String>list){}   //signatura: m2_list*/

    <T> void m3(List<T> list){}  //asta merge pentru ca e generic si acum putem sa folosim orice tip de data. Nu ne mai limiteaza erasure-ul la overloading
}

class B extends A{ //mostenire => clasa B mosteneste clasa A, adica poate folosi metodele din clasa parinte
    @Override
    void m(short i){    //aici e ovverriding/suprascriere a metodelor in A
        System.out.println("m_short from B");
    }
    @Override
    void m(int i){
        System.out.println("m_int from B");
    }

    void oMetoda(){
        this.m(5); // se apeleaza metoda din B
        super.m(5); //se apeleaza metoda din A
    }
}