package code._4_student_effort;

public class StudentFizzBuzz implements Command {
    public void exec(int maxLimit) {
        for (int i = 1; i <= maxLimit; i++) {
            String toPrint = "";
            if (i % 3 == 0)
                toPrint += "Fizz";
            if (i % 5 == 0)
                toPrint += "Buzz";
            if (i % 11 == 0)
                toPrint += "Jazz"; //Here I assumed we add the word
            if (i % 7 == 0)
                toPrint = "Rizz"; //Challenge statement unclear, I assumed complete override is required
            if (toPrint.equals(""))
                toPrint = String.valueOf(i);
            if (i != 100)
                toPrint += ", ";
            System.out.print(toPrint);
        }
    }
}
