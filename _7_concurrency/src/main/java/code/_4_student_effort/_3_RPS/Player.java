package code._4_student_effort._3_RPS;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class Player extends Thread{
    private String choose;

    public void run() {
        List<String> options = asList("paper", "scissors", "rock");
        choose = options.get(new Random().nextInt(3));
    }

    public String getChoose() {
        return choose;
    }
}
