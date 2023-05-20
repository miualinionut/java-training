package code._4_student_effort.fizz_buzz;

public class Fizz2 {

    public String fizz (int i) {
        String s = "";

        Correlation[] correlations = {
                new Correlation(3, "Fizz"),
                new Correlation(5, "Buzz"),
        };

        boolean isDivisible = false;
        for(Correlation correlation : correlations) {
            if(i % correlation.getNumber() == 0) {
                isDivisible = true;
                s += correlation.getWord();
            }
        }

        if(!isDivisible) {
            s = String.valueOf(i);
        }

        return s;
    }
    public String fizz2(int i) {
        String s = "";
        Correlation[] correlations = {
                new Correlation(3, "Fizz"),
                new Correlation(5, "Buzz"),
                new Correlation(7, "Rizz"),
                new Correlation(11, "Jazz"),
        };

        boolean isDivisible = false;
        for(Correlation correlation : correlations) {
            if(i % correlation.getNumber() == 0) {
                isDivisible = true;
                s+= correlation.getWord();
            }
        }

        if(!isDivisible) {
            s = String.valueOf(i);
        }

        return s;
    }
}
