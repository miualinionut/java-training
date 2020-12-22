package code._4_student_effort;

public class PairDriver {

    public static void main(String[] args) {
        Running runningShoe1 = new Running("Red", 41);
        Running runningShoe2 = new Running("Red", 41);
        Pair<Running> pair1 = new Pair<>(runningShoe1, runningShoe2);

        Running runningShoe3 = new Running("Red", 41);
        Boot boot1 = new Boot("Black", 45);
        //Pair <Running> pair2 = new Pair<>(runningShoe3, boot1);

        Running runningShoe4 = new Running("Red", 41);
        Running runningShoe5 = new Running("Red", 42);
        //Pair <Running> pair3 = new Pair<>(runningShoe4, runningShoe5);

        Heels heels1 = new Heels("Brown", 37);
        Heels heels2 = new Heels("White", 37);
        //Pair <Heels> pair4 = new Pair<>(heels1, heels2);
    }


}
