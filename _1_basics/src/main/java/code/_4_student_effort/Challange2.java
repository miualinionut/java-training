package code._4_student_effort;

public class Challange2 {
    public boolean b = false;

    public String compute(int n) {
        String s = "";
        if (n % 3 == 0) s += "Foo";
        if (n % 5 == 0) s += "Bar";
        if (n % 7 == 0) s += "Qix";
        char[] digits = String.valueOf(n).toCharArray();
        for(char digit: digits)
        {
            switch (digit) {
                case 3:
                    s += "Foo";
                    b = true;
                    break;
                case 5:
                    s += "Bar";
                    b = true;
                    break;
                case 7:
                    s += "Qix";
                    b = true;
                    break;
            }
        }
        if (b==false) {
            return "" + n;
        }
        if (s.isEmpty()) {
            s = String.valueOf(n);

        }
        return s;
    }

    public static void main(String[] args) {


    }
}




