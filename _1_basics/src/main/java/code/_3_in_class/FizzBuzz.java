package code._3_in_class;

public class FizzBuzz {
    public static void main(String[] args) {

        int nr;
        //  fizzBuzzCuIf();
        fizzBuzzCuObiecte();
    }

    private static void fizzBuzzCuObiecte() {

        CorelatieNrString[] corelatii = {
                new CorelatieNrString(3, "Fizz"),
                new CorelatieNrString(5, "Buzz"),
                new CorelatieNrString(7, "Rizz"),
                new CorelatieNrString(11, "Tizz")

        };
        for (int i = 1; i <= 100; i++) {
            boolean nrEsteDivizibil = false;
            String textPtNrDivizibil = "";
            for (CorelatieNrString corelatie : corelatii) {
                if (i % corelatie.nr == 0) {
                    textPtNrDivizibil = textPtNrDivizibil + corelatie.word;
                    nrEsteDivizibil = true;
                }
            }
            if (nrEsteDivizibil == true) {
                System.out.println(textPtNrDivizibil);
            } else {
                System.out.println(i);
            }
        }
    }

    private static void fizzBuzzCuIf() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
