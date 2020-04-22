package code._4_student_effort;

public class Challenge_1 {
    public static void FizzBuzz(){
        String s = "";
        for (int i = 1; i <= 100;i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    s += "FizzBuzz, ";
                } else {
                    s += "Fizz, ";
                }
            } else if (i % 5 == 0) {
                s +="Buzz, ";
            } else if (i % 7 == 0) {
                s += "Rizz, ";
            } else if (i % 11 == 0) {
                s +="Jazz, ";
            } else {
                s += i + ", ";
            }
        }

        String sToPrint = s.substring(0, s.length() - 2);
        System.out.print(sToPrint);
    }
}
