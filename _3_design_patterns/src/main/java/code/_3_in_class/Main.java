package code._3_in_class;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here

        //Notite din timpul cursului - sapt 3

        /*
        *
        * -design pattern = solutie a unei probleme intr-un context dat
        * -categorii de design patterns: de creare de obiecte, de structurare a codului, de behaviour (adaugare sau stergere de behaviour)
        *
        *
        *
        * -in design patternul creational exista 5 categorii
        *
        * -pentru declararea variabilelor globale folosim Singleton Pattern
        *
        *
        * -SINGLETON:
        * -structura clasica se bazeaza pe un constructor privat si pe o metoda GetInstance
        * class C{ prrivate C(){}
        *   private static C instance = new C();     //eager initialization - se initializeaza chiar daca nu o sa fie folosit
        *   public static int getInstance(){
        *       return instance;
        *   }
        *
        * class C{ prrivate C(){}
         *   private static C instance = null;     //lazy initialization - se initializeaza la prima utilizare
         *   public static int getInstance(){
         *      if(instance==null)
         *          instance=new C();
         *       return instance;
         *   }
        *
        * -INTREBARE DE INTERVIU - programatorul nu trebuie sa dezaloce manual memoria, exista un mecanism automat numit GarbageCollector
        * -memory leak = atunci cand raman niste date si care nu pot fi sterse de GarbageCollector niciodata. Campurile statice nu sunt sterse de GarbageCollector pentru ca raman in clasa, iar clasa ramane in MetaSpace
        *
        *
        * -FACTORY:
        * -of()
        * -valueOf()
        * -make()
        *
        * -ABSTRACT FACTORY
        *
        * In Java metodele sunt by default virtuale. Nu exista "virtual".
        * Conceptul de virtual constructor se duce cu gandul la un constructor care poate fi polimorfic.
        *
        *
        * -BUILDER:
        * -construirea unui obiect complex (apare des la interviu)
        * -clasa Builder este o clasa statica din interiorul clasei parinte si este un nested class
        * -clasa parinte are acces la toate campurile din clasa copil
        * -facem un setter de tip builder pentru fiecare parametru si returnam "this" ceea ce este o instanta de tip builder
        *
        *
        * -PROTOTYPE:
        * -un design pattern care te ajuta atunci cand vrem sa cache-uim ceva
        * -la prima instanta la care calculam o valoare greu de calculat, o salvam in cache pentru a putea fi refolosita, in loc sa fie recalculata
        * -in momentul in care fac un obiect nou si repopulez parti din el folosind ce am salvat in cache, se numeste PROTOTYPE
        *
        *
        *
        *
        * -in design patternurile structurale exista:
        *
        * -ADAPTER
        * -COMPOSITE
        * -PROXY
        * -FLYWEIGHT
        * -FACADE
        * -BRIDGE
        * -DECORATOR
        *
        * */
    }
}