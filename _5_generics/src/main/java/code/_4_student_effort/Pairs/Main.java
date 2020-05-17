package code._4_student_effort.Pairs;

public class Main {
    public static void main(String[] args) {

        Running sportShoe1 = new Running("RED",41);
        Running sportShoe2 = new Running("RED",41);
        Pair<Running>  pairOK = new Pair<>(sportShoe1,sportShoe2);

        Boot bootShoe = new Boot("Black",45);
        Boot bootShoe2 = new Boot("pink",45);
        Running sportShoe3 = new Running("RED",39);

        Pair<Running> pairTest = new Pair<>(sportShoe1,sportShoe3);
        Pair<Boot> pairTest2 = new Pair<>(bootShoe,bootShoe2);

        //Pair<Running> pairNotOK = new Pair<>(sportShoe1,bootShoe);  eroare la compilare
    }
}
