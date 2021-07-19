package code._3_in_class;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //TODO put your code changes in here

        //Notite

        /*
        *
        * - un proces are mai multe thread-uri
        * - de fiecare data cand vrem sa executam niste linii de cod, liniile de cod vor fi imbracate intr-un thread
        *
        * -TIME SLICING
        * (impartirea timpului)
        * CPU-ul executa instructiuni secvential
        * fiecarui thread, CPU-ul ii aloca un timp fix si alterneaza intre thread-uri
        *
        * - OPERATII ATOMICE
        * - o operatie care nu se poate diviza ( operatie care se executa intr-un singur ciclu de procesor)
        * - " v++ " este cod java. Cand il compilez ajunge in bytecode dupa care ajunge in cod nativ.
        * 1. read from memory
        * 2. increment
        * 3. write to memory
        * deci v++ se divide in 3 operatii in cod nativ, deci nu este atomica
        *
        * - problemele de concurenta (contention) le rezolvam prin sincronizare (Synchronization)
        *
        *
        * - de fiecare data cand lucrez cu thread-uri si am shared "state" pot ajunge in probleme de sincornizar
        *
        *
        * - LIVENESS
        *
        * - DEADLOCK
        * - STARVATION
        * - LIVELOCK
        *
        * INTREBARE DE INTERVIU: ce face "volatile" in java?
        *
        *
        *
        * */
    }
}