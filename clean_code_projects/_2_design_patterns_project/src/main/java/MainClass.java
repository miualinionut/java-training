import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.setOut;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("PROIECT JAVA DESIGN PATTERNS");
        System.out.println("Alegeti design pattern-ul:");
        System.out.println("1.Singleton");
        System.out.println("2.Observer");
        System.out.println("3.Factory");
        System.out.println("4.Inchidere program");
        int caz;
        Scanner s = new Scanner(System.in);
        caz = s.nextInt();
        while (caz > 4 || caz <= 0){
            System.out.println("Alegeti una din optiuni:");
           caz = s.nextInt();
        }
        if (caz==4)
            exit(0);

        while (true){
            switch (caz){
                case 1:
                    //Initializare pentru variabila x de tip Singleton
                    Singleton x = Singleton.getInstance();
                    //Initializare pentru variabila y de tip Singleton
                    Singleton y = Singleton.getInstance();
                    //Initializare pentru variabila z de tip Singleton
                    Singleton z = Singleton.getInstance();

                    System.out.println("Initializare variabile x,y si z");
                    System.out.println("Stringul s din cele 3 variabile inainte de modificare:");
                    System.out.println("Pentru x:" + x.s);
                    System.out.println("Pentru y:" + y.s);
                    System.out.println("Pentru z:" + z.s);
                    System.out.println("\n");

                    //Schimb variabila s din x:
                    x.s = x.s.toUpperCase();

                    System.out.println("Stringul s din cele 3 variabile dupa modificare:");
                    System.out.println("Pentru x:" + x.s);
                    System.out.println("Pentru y:" + y.s);
                    System.out.println("Pentru z:" + z.s);
                    System.out.println("\n");

                    System.out.println("Datorita design pattern-ului Singleton, cele 3 variabile \nx,y si z primesc aceeasi instanta la creare, deci variabila \ns se va modifica in fiecare din cele 3 variabile");
                    break;
                case 2:
                    System.out.println("Vom adauga 2 utilizatori, Alin si Ionut, si ii adaugam pe lista de \nobserveri pentru produsul Samsung Galaxy A50.");
                    System.out.println("Acestia vor fi notificati automat in momentul in care vor mai aparea telefoane A50 in stock pe magazinul lui Bogdan");
                    Person alinPerson = new Person("Alin");
                    Person ionutPerson = new Person("Ionut");

                    Produs samsungA50 = new Produs("Samsung Galaxy A50","Telefon mobil","nu e stock");

                    samsungA50.registerObserver(alinPerson);
                    samsungA50.registerObserver(ionutPerson);

                    //Acum produsul este valabil
                    samsungA50.setValabilitate("in stock");
                    break;
                case 3:
                    ShapeFactory fabrica = new ShapeFactory();
                    System.out.println("Alegeti tipul de forma geometrica dintre: Patrat, Dreptunghi, Hexagon, Dodecaedru");
                    System.out.println("In functie de tipul ales, se va instantia variabila de tipul FormaGeometrica cu \n forma aleasa de dumneavoastra si se va apela functia draw corespunzatoare");
                    String sir = s.next();
                    FormaGeometrica forma;
                    forma = fabrica.getFormaGeometrica(sir);
                    forma.draw();
                default:
                    break;
            }
            System.out.println("Alegeti design pattern-ul:");
            System.out.println("1.Singleton");
            System.out.println("2.Observer");
            System.out.println("3.Factory");
            System.out.println("4.Inchidere program");
            caz = s.nextInt();
            while (caz > 4 || caz <= 0){
                System.out.println("Alegeti una din optiuni:");
                caz = s.nextInt();
            }
            if (caz == 4)
                break;
        }
    }
}
