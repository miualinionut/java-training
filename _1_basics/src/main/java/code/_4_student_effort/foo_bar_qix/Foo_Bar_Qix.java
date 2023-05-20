package code._4_student_effort.foo_bar_qix;

public class Foo_Bar_Qix {
    public String compute(int i) {
        String s = "";

        Correlation[] correlations = {
                new Correlation(3, "Foo"),
                new Correlation(5, "Bar"),
                new Correlation(7, "Qix"),
        };
        boolean isDivisible = false;
        boolean contains = false;
        for(Correlation correlation : correlations) {
            if(i % correlation.getNumber() == 0) {
                isDivisible = true;
                s+=correlation.getWord();
            }
            int temp = i;
            while(temp > 0) {
                if(temp % 10 == correlation.getNumber()) {
                    contains = true;
                    s+=correlation.getWord();
                }
                temp /= 10;
            }
        }
        if(!isDivisible && !contains) {
            s = String.valueOf(i);
        }
        return s;
    }

    public String compute2(int i) {
        String s = "";

        Correlation[] correlations = {
                new Correlation(3, "Foo"),
                new Correlation(5, "Bar"),
                new Correlation(7, "Qix"),
        };

        boolean isDivisible = false;
        for(Correlation correlation : correlations) {
            if(i % correlation.getNumber() == 0) {
                isDivisible = true;
                s+=correlation.getWord();
            }

        }

        char[] digits = String.valueOf(i).toCharArray();
        for(char digit : digits) {
            if(digit == '3') {s+= "Foo";}
            else if(digit == '5') {s+="Bar";}
            else if(digit == '7') {s+= "Qix";}
            else if(digit == '0') {s+="*"; }
            else if(!isDivisible) {s+=digit;}
        }

        return s;
    }
}
