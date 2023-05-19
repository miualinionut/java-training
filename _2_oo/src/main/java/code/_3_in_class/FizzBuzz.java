package code._3_in_class;

public class FizzBuzz {
    public static void main(String[] args) {

        //fizzBuzzCuIfuri();
        fizzBuzzCuObiecte();

    }

    private static void fizzBuzzCuObiecte() {

        CorelatieNrString[] corelatii={
                new CorelatieNrString(3,"Fizz"),
                new CorelatieNrString(5,"Buzz"),
                new CorelatieNrString(7,"Rizz"),
                new CorelatieNrString(11,"Jazz")
        };


        for(int i=1;i<=100;i++){

            boolean nrEsteDivizibil=false;
            String textDePrintat="";

            for(CorelatieNrString corelatie: corelatii){
                if(i%corelatie.numar==0){
                    //System.out.println(corelatie.string);
                    textDePrintat+=corelatie.string;
                    nrEsteDivizibil=true;
                }
            }
            if(nrEsteDivizibil==true){
                System.out.println(textDePrintat);
            }else
                System.out.println(i);
        }
    }

    private static void fizzBuzzCuIfuri() {
        for(int i=1;i<=100;i++) {
           if(i%3==0 || i%5==0 || i%7==0 || i%11==0) {
               if (i % 3 == 0)
                   System.out.print("Fizz");

               if (i % 5 == 0)
                   System.out.print("Buzz");

               if(i%7==0)
                   System.out.print("Rizz");

               if(i%11==0)
                   System.out.print("Jazz");

               System.out.println();
           }else
                System.out.println(i);

        }
    }
}
