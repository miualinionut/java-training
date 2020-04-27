package code._3_in_class;

public class Masina {
    //state
    String culoare;
    String marca;

    //behaviour
    //PRINCIPII: clean code
        //DRY - don't repeat yourself

    void start() {
        System.out.println("masina porneste");
    }
    void stop() {
        System.out.println("masina se opreste");
    }
    void steer() {
        System.out.println("masina coteste");
    }

}
