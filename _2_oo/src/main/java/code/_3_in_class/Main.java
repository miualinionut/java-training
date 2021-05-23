package code._3_in_class;


//Notite din timpul cursului

/*
*
* -numele de clasa se scrie cu litera mare
* -parametrul unei metode este cel pe care il definim atunci cand scriem metoda
* -argumentul este cel pe care il ofer atunci cand apelez metoda
* -cand nu stim cati parametrii sa ii dam unei metode, putem folosi "varargs"
* -varargs arata asa:  void m(Integer...i)    si putem apela asa    m(1,2,3,4,5)
* -primitivele sunt int,double,float,long,boolean etc.
* -obiectele sunt scrise cu litera mare, de exemplu Integer,Float,Boolean,Double etc.
* -imutabilitatea inseamna ca odata ce obiectul a fost initializat, nu se mai poate face o schimbare
* -mutabil=se poate schimba starea
* -daca vreau sa fac o clasa imutabila, ar trebui sa facem clasa "finala" si campurile din ea sa fie "finale"
* -overloading=folosim acelasi nume de metoda dar schimbam tipul parametrilor
* -constructorii->este responsabil sa initializeze o clasa
* -constructorii pot fi overloaded, adica aceiasi denumire de constructor dar cu parametrii diferiti
* -principiul Command Query separation: daca e o metoda de tip command inseamnca ca o sa schimbe starea unui obiect. Daca e o metoda de tip Query, inseamna ca vreau sa obtin ceva, sa interoghez ceva (ca un getter)
* -este de preferat sa nu avem intr-o singura metoda si command si query pentru ca devine neintuitiv.
* -----sa ma uit pe net legat de covariant return type-----
* -nu putem face upcasting, adica de exemplu: merge sa returnam tot ce e sub number, dar nu merge sa returnam object, care e deasupra lui number pentru un obiect de tip number
* -e recomandat sa nu folosim public
* -este recomandat ca intr-un getter sa facem o copie a obiectului si dupa sa ii dam return, ca sa fie protejat obiectul initial
* -membrii unei clase sunt atat campurile cat si metodele
* -cand folosim static, acei membrii sunt folositi la nivel de clasa, nu de instanta
* -avem 2 variante: cand ne facem un camp static. Sa il apelam prin clasa, sau sa facem o instanta a clasei si sa apelam campul. Nu e recomandat sa apelam prin instanta pentru ca nu mai este clar ca e un camp static. E mai bine sa apelam prin clasa
* -constanta->pe langa static, se adauga si final. Astfel se face o constanta si de obicei se scriu exclusiv cu litere mari (exemplu: static final double PI = 3.14)
* -constantele sunt setate de la compilare, deci in librarii, daca schimbam valoarea constantei trebuie sa recompilam codul
* -nested classes->poti face o clasa in interiorul altei clase care are acces la campurile clasei parinte
* -local classes->sunt adaugate in interiorul unei metode. Este de evitat pentru ca complica lucrurile
* -daca sunt clase statice, sunt nested, daca sunt nestatice sunt inner (pentru concepul de nested class)
* -nested class e recomandat atunci cand ai nevoie de clasa respectiva sa fie statica (exemplu: design patternul Builder)
* -anonymous classes nu au nume si sunt folosite atunci cand ai o metoda care primeste ca parametru o interfata, iar acea interfata are la randul ei o metoda (exemplu: la android   button.setOnClickListener...)
* -abstract classes->o clasa devine abstracta atunci cand are cel putin o metoda abstracta. Nu pot fi instantiate.
* -enum types -> un tip special de date care se initializeaza o singura data (exemplu: singleton). Poate sa aiba atat campuri cat si constructori.
* -obiectele au stare, expusa in campuri, si behavior, prin metode
* -interfete -> seamana cu clasele abstracte. Diferenta e ca in ele putem sa avem niste metode. Ele sunt utile cand vrem sa avem comportamente diferite pentru niste obiecte.
* -campurile declarate in interfata sunt automat public static final
* -metodele sunt automat publice si abstracte
* -pe langa metodele statice, pot fi si metode default, in care putem pune cod. Practic e ca o metoda clasica. Acum putem pune in interfete si un body.
* -pe cele statice nu le putem suprascrie in clasele care mostenesc interfata, in schimb pe cele default le putem suprascrie
* -in java nu avem mostenire multipla, adica nu putem sa mostenim o clasa din mai multe clase. Putem avea o singura clasa parinte
* -overriding -> cand suprascriem in copil comportamentul pe care il mostemin de la parinte
* -putem implementa mai multe interfete deodata
* -cand avem conflicte de nume, are avantaj mostenirea
* -metodele statice nu pot fi suprascrise
* -keyword-ul "super" se refera la implementarea parintelui
* -cu "super" intotdeauna accesam camp de instanta, deci acel camp nu trebuie sa fie static. Altfel o sa dea eroare de compilare.
* -clasa Object este parintele tuturor claselor.
* -Object are mai multe metode: clone(), equals(Object obj), hashCode()
* -daca vrem sa ne suprascriem metoda clone(), trebuie sa implementam interfata Cloneable
* -cand suprascriem metoda equals() suntem obligati sa suprascriem si metoda hashCode() deoarece schimbam adresa variabilei in hexazecimal (INTREBARE DE INTERVIU)
* -putem face importuri statice
* -composition -> reutilizez behavior-ul dintr-o alta clasa fara a o extinde. Se intampla atunci cand am o clasa student si in interiorul clasei student declar un camp de tip curs (adica declar o variabila din alta clasa intr-o alta clasa)
* -polimorfismul -> posibilitatea de a da unui obiect mai multe forme
* -exista polimorfism static (cand facem overloading) si dinamic (cand facem overriding)
* -principii: GoF si SOLID (AMBELE SUNT INTREBARI DE INTERVIU)
*
* */



public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here

        String student="student";
        student+="new student"; //asa incarc memoria deoarece cu fiecare concatenare se face un nou obiect in memorie


        StringBuilder sb = new StringBuilder();
        sb.append("a");  //daca folosesc StringBuilder e mai optim
    }
}