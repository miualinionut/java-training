package code._4_student_effort;

public class Main {

    public static void main(String[] args) {
//        int a1 = 12;
//        int a2 = 56;
//        int a3 = a1+a2;
//        //byte a3 = a1+a2; deoarece fiecare operatie aritmetica se realizeaza cu operatorul int
//        System.out.println("a3 = " + a3);

//        int mood = 2;
//        String moodString;
//        switch (mood) {
//            case 1 : moodString = "Sad";
//            break;
//            case 2 : moodString = "Happy";
//            break;
//            default: moodString = "Invalid mood";
//            break;
//        }
//        System.out.println(moodString);
//
//        int count = 1;
//        while (count < 11) {
//            System.out.println("Count is: " + count);
//           count++;

//        int count = 1;
//       do {
//            System.out.println("Count is: " + count);
//           count++;
//        }
//       while (count<11);
//
//        for (int i = 1; i<11; i++){
//            System.out.println("Count is " + i);
//        }
//        for ( ; ; ) {
//            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//            for (int item : numbers) {
//                System.out.println("count is " + item);
//            }
//        }

        long n = 461012;
        System.out.format("%d%n", n);
        System.out.format("%011d%n", n);
        System.out.format("%+11d%n", n);
        System.out.format("%,8d%n", n);
        System.out.format("%+,8d%n", n);
   }
}
