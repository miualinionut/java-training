package code._4_student_effort;

public class FooBarQix {
    public static String compute(int i) {
        String answer = "";
        char[] contain_digits = String.valueOf(i).toCharArray();
        if (i % 3 == 0)
            answer += "Foo";
        if (i % 5 == 0)
            answer += "Bar";
        if (i % 7 == 0)
            answer += "Qix";

        for (int j = 0; j < contain_digits.length; ++j) {
            if (contain_digits[j] == '3')
                answer += "Foo";
            else if (contain_digits[j] == '5')
                answer += "Bar";
            else if (contain_digits[j] == '7')
                answer += "Qix";
            else
                answer += contain_digits[j];
        }
        if (answer.equals(""))
            return String.valueOf(i);
        return answer;
    }

    public static String compute2(int i) {
        String answer = "";
        char[] contain_digits = String.valueOf(i).toCharArray();
        if (i % 3 == 0)
            answer += "Foo";
        if (i % 5 == 0)
            answer += "Bar";
        if (i % 7 == 0)
            answer += "Qix";

        for (int j = 0; j < contain_digits.length; ++j) {
            if (contain_digits[j] == '3')
                answer += "Foo";
            else if (contain_digits[j] == '5')
                answer += "Bar";
            else if (contain_digits[j] == '7')
                answer += "Qix";
            else if (contain_digits[j] == '0')
                answer += "*";
            else
                answer += contain_digits[j];
        }
        if (answer.equals(""))
            return String.valueOf(i);
        return answer;
    }

    public static String result(int start_value, int end_value) {
        String answer = "";
        for (int i = start_value; i <= end_value; ++i) {
            answer += compute2(i) + ' ';
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(FooBarQix.result(1, 200));
    }
}
