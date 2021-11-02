package code._4_student_effort;

public class FizzBuzz1 {
    public static String fizzBuzz() {
        StringBuilder sb = new StringBuilder("");
        //3 5 7 11
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                sb.append("Fizz,");
            } else if (i % 5 == 0) {
                sb.append("Buzz,");
            } else if (i % 7 == 0) {
                sb.append("Rizz,");
            } else if (i % 11 == 0) {
                sb.append("Jazz,");
            } else {
                sb.append(i + ",");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(fizzBuzz());
    }
}
