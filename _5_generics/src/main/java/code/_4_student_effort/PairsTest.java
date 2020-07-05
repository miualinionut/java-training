package code._4_student_effort;

public class PairsTest {

    public static void main(String[] args) {

        Running runningShoe1 = new Running("RED", 41);
        Running runningShoe2 = new Running("RED", 41);

        Pair<Running> pairOk = new Pair<>(runningShoe1, runningShoe2);

//    Running runningShoe3 = new Running("RED", 41);
//    Boot bootShoe = new Boot("BLACK", 45);
//    Pair<Running> pairOk1 = new Pair<>(runningShoe1, bootShoe)

        Running runningShoe3 = new Running("RED", 42);
        Running runningShoe4 = new Running("RED", 41);

        Pair<Running> pairOk2 = new Pair<>(runningShoe3, runningShoe4);
    }
}
