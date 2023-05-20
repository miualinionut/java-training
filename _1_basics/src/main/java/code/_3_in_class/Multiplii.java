package code._3_in_class;

class Numere {
    public static void Multiplii(int n) {

        int i;
        for (i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz");
                System.out.print(" ");
            }
            else if (i % 3 == 0) {
                System.out.print("Fizz");
                System.out.print(" ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz");
                System.out.print(" ");
            }  else {
                System.out.print(i);
                System.out.print(" ");
            }
        }

    }

    public static void main(String[] args) {
        Multiplii(100);
    }
}
