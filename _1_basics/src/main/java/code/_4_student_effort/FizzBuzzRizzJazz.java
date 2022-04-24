package code._4_student_effort;

public class FizzBuzzRizzJazz {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0)
                s.append("Fizz");
            if(i % 5 == 0)
                s.append("Buzz");
            if(i % 7 == 0)
                s.append("Rizz");
            if(i % 11 == 0)
                s.append("Jazz");
            if(s.toString().equals(""))
                System.out.print(i + ", ");
            else
                System.out.print(s + ", ");
            s = new StringBuilder();
        }
    }
}