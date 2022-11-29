package code._4_student_effort.challenge_2;

public class FooBarQix {
    private NumberToWord[] stageOne, stageTwo;

    public FooBarQix() {
        this.stageOne = new NumberToWord[] {
                new NumberToWord(3, "Foo"),
                new NumberToWord(5, "Bar"),
                new NumberToWord(7, "Qix")
        };
        this.stageTwo = new NumberToWord[] {
                new NumberToWord(0, "*"),
                new NumberToWord(3, "Foo"),
                new NumberToWord(5, "Bar"),
                new NumberToWord(7, "Qix")
        };
    }

    private String checkDivisibility(int number, NumberToWord[] numberToWords) {
        String s = "";
        for (NumberToWord it: numberToWords)
            if (number % it.getNumber() == 0)
                s += it.getWord();
        return s;
    }

    private String checkAppearance(int number, NumberToWord[] numberToWords) {
        String s = "";
        char[] digits = String.valueOf(number).toCharArray();
        for (char digit: digits)
            for (NumberToWord it: numberToWords)
                if (Character.getNumericValue(digit) == it.getNumber())
                    s += it.getWord();
        return s;
    }

    public String solveChallenge(int number, NumberToWord[] divisibilityWords, NumberToWord[] appearanceWords) {
        String s = checkDivisibility(number, divisibilityWords);
        s += checkAppearance(number, appearanceWords);
        if (s.isEmpty())
            return String.valueOf(number);
        return s;
    }
    public String compute(int number) {
        return solveChallenge(number, this.stageOne, this.stageOne);
    }

    public String compute2(int number) {
        String s = solveChallenge(number, this.stageOne, this.stageTwo);
        boolean onlyAsterix = true;
        char[] chars = s.toCharArray();
        for (char it: chars)
            if (it != '*')
                onlyAsterix = false;
        if (!onlyAsterix)
            return s;
        s = "";
        char[] digits = String.valueOf(number).toCharArray();
        for (char digit: digits) {
            if (digit == '0')
                s += "*";
            else
                s += Character.toString(digit);
        }
        return s;
    }
}
