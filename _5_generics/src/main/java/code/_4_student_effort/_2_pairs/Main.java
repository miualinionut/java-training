package code._4_student_effort._2_pairs;

public class Main {
    public static void main(String[] args) {
        Running rShoe1 = new Running("RED", 41);
        Running rShoe2 = new Running("CAS", 41);
        Boot bootShoe1 = new Boot("BLACK", 42);
        Pair<Running> pair = new Pair<>(rShoe1, rShoe2);


    }
}
