package code._4_student_effort;

public class FizzBuzz{

        static void Stage1(){ // Doar Fizz si Buzz

            for(int i=1; i<=100; i++) {
                if ((i % 3 == 0) && (i % 5 == 0)) System.out.print("FizzBuzz, ");

                else if (i % 3 == 0) System.out.print("Fizz, ");

                else if (i % 5 == 0) System.out.print("Buzz, ");

                else System.out.print(i + ", ");
            }
        }

        static void Stage2(){ // Doar Rizz si Jazz

            for(int i=1; i<=100; i++) {
                if ((i % 7 == 0) && (i % 11 == 0)) System.out.print("RizzJazz, ");

                else if (i % 7 == 0) System.out.print("Rizz, ");

                else if (i % 11 == 0) System.out.print("Jazz, ");

                else System.out.print(i + ", ");
            }
        }


       static void Stage3(){ // Toate combinate

            for(int i=1; i<=100; i++) {
                if ((i % 7 == 0) && (i % 11 == 0)) System.out.print("RizzJazz, ");

                else if ((i % 3 == 0) && (i % 5 == 0)) System.out.print("FizzBuzz, ");

                else if ((i % 7 == 0) && (i % 5 == 0)) System.out.print("RizzBuzz, ");

                else if ((i % 7 == 0) && (i % 3 == 0)) System.out.print("RizzFizz, ");

                else if ((i % 3 == 0) && (i % 11 == 0)) System.out.print("FizzJazz, ");

                else if ((i % 5 == 0) && (i % 11 == 0)) System.out.print("BuzzJazz, ");

                else if (i % 3 == 0) System.out.print("Fizz, ");

                else if (i % 5 == 0) System.out.print("Buzz, ");

                else if (i % 7 == 0) System.out.print("Rizz, ");

                else if (i % 11 == 0) System.out.print("Jazz, ");

                else System.out.print(i + ", ");
           }
        }


    public static void main(String[] args){
        System.out.println("Stage 1: ");
        Stage1();

        System.out.println("\n\nStage 2: ");
        Stage2();

        System.out.println("\n\nStage 3: ");
        Stage3();


    }

}