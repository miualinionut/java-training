package code._4_student_effort._2_PascalTriangle;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        int n = 4;

        for(int i = 0; i <= n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print(" ");
            }

            for(int j = 0; j <= i; j++){
                System.out.print(" " + rest(i, j));
            }
            System.out.println();
        }
    }

    static int factorial(int n){
        int fact;

        for(fact = 1; n > 1; n--){
            fact *= n;
        }
        return fact;
    }

    static int rest(int n, int r){
        return factorial(n) / (factorial(n - r) * factorial(r));
    }

}
