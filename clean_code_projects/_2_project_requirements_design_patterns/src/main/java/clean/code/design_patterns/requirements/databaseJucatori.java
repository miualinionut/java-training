package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Folosim Singleton Pattern pentru a avea o singura baza de date care sa stocheze datele jucatorilor
public class databaseJucatori<jucatoriFotbal> {

    private static databaseJucatori instance = new databaseJucatori();//cream un obiect de tipul databaseJucator
    private List<jucatorFotbal> listJucatori;

    //facem constructorul privat pentru ca aceasta clasa sa nu mai poata fi initializata
    //astfel vom avea doar o instanta a clasei databaseJucatori
    private databaseJucatori() {
        listJucatori = new ArrayList<jucatorFotbal>();
    }
    //Get the only object available
    public static databaseJucatori getInstance(){
        System.out.println("Database-ul a fost creat!");
        return instance;
    }

    public void adaugaJucator(jucatorFotbal j) {
        listJucatori.add(j);
    }

    public void removeObject(jucatorFotbal j) {
        listJucatori.remove(j);
    }

    public List<jucatorFotbal> getAllObjects() {
        return listJucatori;
    }

    public int getSize() {
        return listJucatori.size();
    }

    //Iterator design pattern

    //    private class databaseIterator implements Iterator<jucatorFotbal> {
//        private int currentIndex = 0;
//
//        public boolean hasNext() {
//            return currentIndex < getSize();
//        }
//
//        public jucatorFotbal next() {
//            if (hasNext()) {
//                jucatorFotbal item = listJucatori.get(currentIndex);
//                currentIndex++;
//                return item;
//            }
//            throw new NoSuchElementException();
//        }
//    }

}
