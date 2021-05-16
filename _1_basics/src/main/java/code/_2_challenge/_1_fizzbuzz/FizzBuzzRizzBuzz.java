package code._2_challenge._1_fizzbuzz;

public class FizzBuzzRizzBuzz {
    public static void main(String[] args) {
        int n = 60;
        for (int i = 1; i <= n; i++) {
            if(i%3 == 0 || i%5 == 0 || i%7 == 0 || i%11 == 0) {
                if (i%3 == 0) {
                    System.out.print("Fizz");
                }
                if (i%5 == 0) {
                    System.out.print("Buzz");
                }
                if(i%7 == 0) {
                    System.out.print("Rizz");
                }
                if(i%11 == 0) {
                    System.out.print("Jazz");
                }
            }
            else {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
