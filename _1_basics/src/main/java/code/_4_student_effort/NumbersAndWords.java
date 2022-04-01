package code._4_student_effort;

public class NumbersAndWords{

    int number;
    String  word;

    public NumbersAndWords(int nr, String w)
    {
        number = nr;
        word = w;
    }
    public static void main(String[] args) {

        NumbersAndWords[] corelations = {new NumbersAndWords(3, "Fizz"),
                                         new NumbersAndWords(5, "Buzz"),
                                        //new NumbersAndWords(15, "FizzBuzz")
        };
        boolean isDivisible;
        String sir = "";
        for(int i = 1; i <= 100; i++)
        {
            isDivisible = false;
            for (NumbersAndWords corelation : corelations) {
                if (i % corelation.number == 0) {
                    sir += corelation.word;
                    isDivisible = true;
                }
            }
            if(!isDivisible)
             sir += String.valueOf(i);
            System.out.println(sir + ' ');
            sir  = "";

        }
    }
}
