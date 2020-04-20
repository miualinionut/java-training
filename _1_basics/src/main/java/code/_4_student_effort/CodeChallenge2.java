package code._4_student_effort;

public class CodeChallenge2 {
    public static void main(String[] args) {

        StringCompute(53);
    }
    public static void StringCompute(int a) {
        String RezultatFoo = "Foo";
        String RezultatBar = "Bar";
        String RezultatQix = "Qix";
        String RezultatFinal = "";
        String RezultatFinalWhile = "";
        if (a % 3 == 0) {
            RezultatFinal = RezultatFoo;
        }

        if (a % 5 == 0) {
            RezultatFinal = RezultatFinal + RezultatBar;
        }

        if (a % 7 == 0) {
            RezultatFinal = RezultatFinal + RezultatQix;
        }
        int b = a;
        while(b != 0){
            int rest = b % 10;
            //System.out.println(rest);
            //System.out.println(RezultatFinal+"gol");
            if(rest == 3){
                RezultatFinalWhile = RezultatFoo + RezultatFinalWhile;
                //System.out.println(RezultatFinalWhile);
            }
            if(rest == 5){
                RezultatFinalWhile = RezultatBar + RezultatFinalWhile;
                //System.out.println(RezultatFinalWhile);
            }
            if(rest == 7){
                RezultatFinalWhile =RezultatQix + RezultatFinalWhile;
                //System.out.println(RezultatFinalWhile);
            }
            b = b / 10;
        }

        RezultatFinal =RezultatFinal + RezultatFinalWhile;
        if (RezultatFinal.equals("")) {
            System.out.println(a);
        } else {
            System.out.println(RezultatFinal);
        }
    }
}
