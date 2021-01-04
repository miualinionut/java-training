package code._4_student_effort.Pairs;

public class PairsExample {
    public static void main(String[] args) {
        Running shoe1 = new Running("Red", 41);
        Running shoe2 = new Running("Blue", 42);
        Pair<Running> pair = new Pair<>(shoe1, shoe2);
    }
}
