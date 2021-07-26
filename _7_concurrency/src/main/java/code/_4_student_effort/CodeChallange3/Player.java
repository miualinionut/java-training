package code._4_student_effort.CodeChallange3;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class Player extends Thread{
    private String choice;

    public String getChoice(){
        return this.choice;
    }

    @Override
    public void run(){
        List<String> options = asList("Rock", "Paper", "Scissors");
        this.choice = options.get(new Random().nextInt(3));
    }
}
