package code._3_in_class;

public class InClassWorking {
    // Semnatura unei metode: nume_metoda tipurile si ordinea paramaetrilor

    void m(int i) {
        System.out.println("S a apleat cu int");
    } // unic: m_int

    void m(Integer i) {
        System.out.println("S a apleat cu Integer");
    } // unic: m_int

    void m(String s) {
    } // unic: m_String

    void m(int i, String s) {

    } // unic: m_int_String

    void m(int i, String s1, String s2) {

    } // unic: m_int_String_String

    public static void main(String[] args) {
        InClassWorking instanta = new InClassWorking();

        double d = 5.0;
        int i = 5;
        float f = 5.0F;
        short small = 5;
        short s = (short) 9999999;
        // Prints -27009
        System.out.println("s = " + s);
        instanta.m(i);
        instanta.m(Integer.valueOf(2));
    }
}
