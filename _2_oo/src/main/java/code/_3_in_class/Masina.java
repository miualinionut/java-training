package code._3_in_class;

public class Masina {
    // State
    private final String culoare;
    private final String marca;
    private int viteza;

    // Constructor
    public Masina(String culoare, String marca) {
        this.culoare = culoare;
        this.marca = marca;
    }

    // Getter & Setter
    public String getCuloare() {
        return culoare;
    }

    public String getMarca() {
        return marca;
    }

    public int getViteza() {
        return viteza;
    }

    public void setViteza(int viteza) {
        this.viteza = viteza;
    }

    // Behavior
    void start()  {
        System.out.println("Masina porneste");
    }

    void stop() {
        System.out.println("Masina se opreste");
    }

    void steer() {
        System.out.println("Masina coteste");
    }

}
