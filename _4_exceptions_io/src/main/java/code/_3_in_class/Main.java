package code._3_in_class;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here

        /*
        * sa citesc despre stack si heap
        *
        * int = primitiva
        * Integer = Obiect = wrapper de int
        *
        * primitivele se stocheaza pe stack
        * obiectele se stocheaza pe heap
        *
        * o exceptie in programarea orientata obiect se traduce tot printr-un obiect
        * cand incercam sa impartim 5 la 0, java genereaza automat fara interventia userului sau programatorului un obiect nou de tip exception
        * obiectul de tip exception contine informatii de tipul: in ce fisier a avut loc exceptia, in ce metoda, la ce linie de cod, care era stack trace-ul(adica lista de apeluri de metoda, ora la care s-a intamplat etc.
        *
        * cand se genereaza un obiect de tip exception, prima data se cauta niste acolade care sa stie sa faca ceva in legatura cu acea exceptie( catch(Exception e){do something...})
        * daca trecand prin toate stack frame-urile, nu gasim un bloc de cod care sa rezolve exceptia, atunci thread-ul moare si se termina cu exceptie(adica crapa aplicatia si se inchide)
        *
        * exceptiile in java sunt:
        *   -checked - taote celelalte care nu extind RuntimeException
        *   -unchecked - extind clasa RuntimeException
        *
        * in java exceptiile sunt ori handled or specified
        *
        * exceptiile pot sa fie reparate
        * exceptiile sunt probleme din codul aplicatiei
        * erorile nu se mai pot repara
        * erorile sunt fenomene externe aplicatiei din care aplicatia nu isi mai poate reveni
        *
        * in java 7 a aparut un nou feature numit multicatch ( a se vedea _2_multicatch)
        *
        * finally executa codul din finally indiferent daca am sau nu eroare, adica indiferent daca s-a intrat in catch sau nu
        * daca avem return in finally, nu mai conteaza niciun alt return din try sau din catch. Returnul o sa fie luat de la finally. Alte linii de cod in try sau catch o sa fie rulate, daca e cazul. Doar return-ul e afectat.
        *
        * AutoCloseable are o metoda close() care inchide automat obiecte care nu mai trebuie tinute deschise
        * daca vrem sa implementam noi metoda noastra close(), trebuie sa implementam AutoCloseable
        *
        * buffered este mereu muuult mai rapid decat non-buffered ( a se vedea fisierul CopyBineryFiles.java)
        * in buffered este design pattern-ul Decorator
        *
        * */


    }

    /*void m(int i, long j) throws IOException {
        try{
            //do something
        } catch(Exception e){
            //in case of error => handle it
            //do something about the error
        }
        throw new IOException("oops");
    }*/
}