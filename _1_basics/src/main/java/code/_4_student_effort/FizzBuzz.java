package code._4_student_effort;

public class FizzBuzz {

    String name;
    Integer nrRepresentation;

    public FizzBuzz(String name, Integer nrRepresentation)
    {
        this.name = name;
        this.nrRepresentation = nrRepresentation;
    }

    public String printName(int currentNumber)
    {
        if(currentNumber % this.nrRepresentation == 0)
            return this.name;
        else
            return "";
    }

    public static void main(String[] args) {
        FizzBuzz f1 = new FizzBuzz("Fizz", 3);
        FizzBuzz f2 = new FizzBuzz("Buzz", 5);
        FizzBuzz f3 = new FizzBuzz("Rizz", 7);
        FizzBuzz f4 = new FizzBuzz("Jazz", 11);

        for(int i=1;i<=100;i++)
        {
            if(f1.printName(i) != "" || f2.printName(i) != "" || f3.printName(i) != "" || f4.printName(i) != "")
                System.out.printf("%s%s%s%s, ", f1.printName(i), f2.printName(i), f3.printName(i), f4.printName(i));
            else
                System.out.printf("%d, ", i);
        }
    }
}
