package code._3_in_class;

public class FizzBuzzChallenge {
   public static void main(String[] args)
   {
     //  fizzBuzzCuIf();
       fizzBuzzCuObiecte();
   }

    private static void fizzBuzzCuObiecte() {

       CorelatieNumarString[] corelatii ={
                new CorelatieNumarString(3,"Fizz"),
                new CorelatieNumarString(5,"Buzz"),
                new CorelatieNumarString(7,"Rizz"),
                new CorelatieNumarString(11, "Jazz")
        };
       for(int i=1;i<=100;i++) {
           boolean nrEsteDivizibil = false;
           String textNrDiv= "";
           for (CorelatieNumarString corelatie : corelatii) {
               if (i % corelatie.nr == 0) {
                   nrEsteDivizibil = true;
                   textNrDiv += corelatie.word;
               }

           }
           if(nrEsteDivizibil==true )
               System.out.println(textNrDiv);
           else System.out.println(i);
       }
    }

    private static void fizzBuzzCuIf() {
        for(int i=1;i<=100;i++)
        {
            if(i%5 == 0 && i%3 == 0)
                System.out.println("FizzBuzz");
            else if(i%3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                    System.out.println("Buzz");
                else
                    System.out.println(i);

        }
    }
}
