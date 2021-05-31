package code._4_student_effort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("CodeChallenge 1-4");
            System.out.println("Please enter a number between 1-4");
            int option = scanner.nextInt();
            switch (option) {
                case 1: {
                    challenge1();
                    break;
                }
                case 2: {
                    challenge2(scanner);
                    break;
                }
                case 3: {
                    challenge3();
                    break;
                }
                case 4: {
                    challenge4();
                    break;
                }


            }
        }
    }

    private static void challenge4() {
        CodeChallenge4 challenge4 = new CodeChallenge4();
        challenge4.requirement();
    }

    private static void challenge3() {
        CodeChallenge3 challenge3 = new CodeChallenge3();
        challenge3.requirement();
    }

    private static void challenge2(Scanner scanner) {
        CodeChallenge2 challenge2 = new CodeChallenge2();
        challenge2.requirement1(scanner);
        challenge2.requirement2(scanner);
    }

    private static void challenge1(){
        CodeChallenge1 challenge1 = new CodeChallenge1();
        challenge1.requirements1();
        challenge1.requirements2();
    }
}
