package code._4_student_effort.FizzBuzz;

public class FizzBuzz {

    final int max = 100;

    public String MakeFizzBuzz() {
        StringBuilder str = new StringBuilder();

        for(int i = 1; i < max; i++){
            if(i % 15 == 0)
                str.append("FizzBuzz, ");
            else if(i % 5 == 0)
                str.append("Buzz, ");
            else if(i % 3 == 0)
                str.append("Fizz, ");
            else if(i % 7 == 0)
                str.append("Rizz, ");
            else if(i % 11 == 0)
                str.append("Jazz, ");
            else
                str.append(Integer.toString(i)).append(", ");
        }

        if(max % 15 == 0)
            str.append("FizzBuzz;");
        else if(max % 5 == 0)
            str.append("Buzz;");
        else if(max % 3 == 0)
            str.append("Fizz;");
        else if(max % 7 == 0)
            str.append("Rizz, ");
        else if(max % 11 == 0)
            str.append("Jazz, ");
        else
            str.append(Integer.toString(max)).append(", ");

        return str.toString();
    }
}
