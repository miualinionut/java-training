package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {
        //TODO implement your design patterns in this package
        jucatorFotbal j1 = new jucatorFotbal("Marginean Razvan", "Machester City", 20, 20, 7, 31, 2, 1);
        jucatorFotbal j2 = new jucatorFotbal("Erling Halland", "Machester City", 22, 35, 7, 38, 2, 0);
        jucatorFotbal j3 = new jucatorFotbal("Cristiano Ronaldo", "Real Madrid", 30, 24, 2, 30, 1, 1);
        jucatorFotbal j4 = new jucatorFotbal("Banel Nicolita", "Steaua Bucuresti", 28, 12, 20, 40, 2, 3);
        jucatorFotbal j5 = new jucatorFotbal("Adrian Mutu", "Fiorentina", 25, 28, 5, 23, 2, 2);
        databaseJucatori db = databaseJucatori.getInstance();
        //System.out.println(j1.toString());
        //j1.toString();
        db.adaugaJucator(j1);
        db.adaugaJucator(j2);
        db.adaugaJucator(j3);
        db.adaugaJucator(j4);
        db.adaugaJucator(j5);
        System.out.println("Numarul de jucatori din database este " + db.getSize() + ".");
        //db.toString();


        //Iterator<jucatorFotbal> iterator = (Iterator<jucatorFotbal>) db.iterator();

        //while (db.iterator().hasNext()) {
        //String item = iterator.next();
        //    jucatorFotbal item = db.iterator().next();;
        //    System.out.println(item);
        // }
        //databaseJucatori.databaseIterator iterator = db.Createiterator();
        //dbIterator iterator = new dbIterator(db.getAllObjects());
        //while (iterator.hasNext()) {
           // jucatorFotbal item = iterator.next();
          //  System.out.println(item.ratingJucator());
        //}
        UI console = new UI();
        console.runMenu();
    }
}
