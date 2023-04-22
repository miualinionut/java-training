package code._3_in_class;

import java.sql.ClientInfoStatus;

public class FizzBuzz {
    public static void main(String[] args) {

        int nr, i;
//        fizzbuzzcuif();
        FizzBuzzCuObiecte();
    }

    private static void FizzBuzzCuObiecte() {
        int i;
        for (i = 1; i <= 100 ; i ++) {
            CorelatieNrString [] arr = {
                    new CorelatieNrString(3, "Fizz"),
                    new CorelatieNrString(5, "Buzz"),
                    new CorelatieNrString(7, "Rizz"),
                    new CorelatieNrString(11, "Tizz"),
            };
            for (i = 1 ; i < 100; i ++){
                boolean nrEDivizibil = false;
                String textPtNrDivizibil = "";
                for(CorelatieNrString arre:arr){
                    if(i%arre.nr == 0){
                        textPtNrDivizibil = textPtNrDivizibil + arre.word;
                        nrEDivizibil = true;
                    }
                }
            if(nrEDivizibil == true){
                System.out.println(textPtNrDivizibil);
            }else {
                System.out.println(i);
            }
            }
        }
    }

    private static void fizzbuzzcuif() {
        int i;
        for (i = 1; i <= 100 ; i ++)
        {
            if(i %15 == 0){
                System.out.println("FizzBuzz");
            } else if (i %3 == 0){
                System.out.println("Fizz ");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i + " ");
            }
        }
    }
}
