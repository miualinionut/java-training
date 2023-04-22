package code._3_in_class.challenge;

public class FizzBuzz {
    public static void main(String[] args) {

        int numar=0;
        //FizzBuzzcuIf();
        FizzBuzzCuObiecte();
    }

    private static void FizzBuzzCuObiecte() {
        CorelatieNumarString[] corelatii ={
                new CorelatieNumarString(3,"Fizz"),
                new CorelatieNumarString(5,"Buzz"),
                new CorelatieNumarString(7,"Rizz"),
                new CorelatieNumarString(11,"Tizz")
        };
        for(int i=1;i<=100;i++)
        {
            boolean Numarulestedivizibil=false;
            String textptnumaruldivizibil="";
            for(CorelatieNumarString corelatie:corelatii)
            {
                if(i % corelatie.numar==0)
                {
                    textptnumaruldivizibil+=corelatie.word;
                    Numarulestedivizibil=true;

                }
            }
            if(Numarulestedivizibil)
            {
                System.out.println(textptnumaruldivizibil);

            }
            else{
                System.out.println(i);
            }
        }
    }

    private static void FizzBuzzcuIf() {
        for(int i=1;i<=100;i++)
        {
            if(i%3==0&&i%5==0)
            {
                System.out.print("FizzBuzz"+" ");
            }
            else if(i%3==0) {
                System.out.print("Fizz" + " ");
            }
            else if(i%5==0){
                System.out.print("Buzz"+" ");
            }
            else
            {
                System.out.print(i + " ");
            }
        }
    }
}
