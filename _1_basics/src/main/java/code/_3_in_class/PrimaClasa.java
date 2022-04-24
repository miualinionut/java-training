package code._3_in_class;

public class PrimaClasa {
    String language = "Java"; //variabila de instanta
    static String limbaj = "Java 18"; //variabila de clasa
    public static void main(String[] args) {
        System.out.println("Bună ziua lume!");
        int varsta = 22; //variabila locala
        String nume = "Popescu"; //variabila locala
        varsta = 23;
    }
}

//PrimaClasa.main(new String[] {"a", "b"});
//PrimaClasa.limbaj = "alta valoare";