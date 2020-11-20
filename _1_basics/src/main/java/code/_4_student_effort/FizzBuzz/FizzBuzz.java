package code._4_student_effort.FizzBuzz;

public class FizzBuzz {
    String str = "";
    public void printString(int nr) {
        if (nr % 3 == 0) {
            if(nr % 5 == 0) {
               str += "FizzBuzz ";
            } else {
                str += "Fizz ";
            }
        } else {
            if(nr % 5 == 0) {
               str += "Buzz ";
            } else {
                str += nr +" ";
            }
        }
        if(nr == 100) {
            System.out.println(str);
        }
    }
}
