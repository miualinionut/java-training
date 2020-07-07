package code._4_student_effort;
public class PairsChallenge {
    public static void main(String[] args) {
        Running runningShoe1 = new Running("RED", 41);
        Running runningShoe2 = new Running("RED", 41);
        Pair<Running> pairOK = new Pair<>(runningShoe1, runningShoe2);


        Boot bootShoe = new Boot("BLACK", 45);
      //  Pair<Running> wrongPair = new Pair<>(runningShoe1,bootShoe);

        Running runningShoe3 = new Running("RED", 41);
        Running runningShoe4 = new Running("RED", 42);
        Pair<Running> pairr = new Pair<>(runningShoe3, runningShoe4);
    }
}
