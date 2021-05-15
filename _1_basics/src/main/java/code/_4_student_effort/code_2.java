package code._4_student_effort;

public class code_2 {
    static String compute(int x) {
        String s = "";
        int cpy_x = x;
        int nr;
        if (x % 3 == 0) {
            s += "Foo";
        }
        if (x % 5 == 0) {
            s += "Bar";
        }
        if (x % 7 == 0) {
            s += "Qix";
        }
        while (x != 0) {
            nr = x % 10;
            if (nr == 3) {
                s += "Foo";
            } else if (nr == 5) {
                s += "Bar";
            } else if (nr == 7) {
                s += "Qix";
            } else if (nr == 0){
                s += "*";
            }
            x /= 10;
        }
        if (s == "")
            s += Integer.toString(cpy_x);
        return s;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 106; i++) {
            System.out.println(i + " => " + compute(i));
        }
    }
}
