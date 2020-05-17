package code._4_student_effort.code_challenge_2_Pair;

public class PairMain {

    public static void main(String[] args) {
        Running running1 = new Running("RED", 41);
        Running running2 = new Running("RED", 41);
        Pair<Running> pairOK = new Pair<>(running1, running2);

        Running runningShoe1 = new Running("RED", 41);
        Boot bootShoe = new Boot("BLACK", 45);
        // This has compliation error
//        Pair<Running> pairKO = new Pair<>(runningShoe1, bootShoe);


        // Checking if the exceptions for color matching works
        Running running11 = new Running("RED", 41);
        Running running12 = new Running("ORANGE", 41);
        Pair<Running> pairColorsNotMatching = new Pair<>(running11, running12);

        // Checking if the exceptions for size matching works
        Running running13 = new Running("RED", 41);
        Running running23 = new Running("RED", 42);
        Pair<Running> pairSizesNotMatching = new Pair<>(running13, running23);
    }
}
