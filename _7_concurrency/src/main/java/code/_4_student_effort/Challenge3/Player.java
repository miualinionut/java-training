package code._4_student_effort.Challenge3;

import java.util.Random;

public class Player extends Thread{
    private String name;
    private String[] options = new String[]{"paper","rock","scissors"};
    private String attack;

    public Player(String name){
        this.name = name;
    }

    public String getAttack() {
        return attack;
    }
    public String getNume(){
        return name;
    }

    @Override
    public void run() {
        Random rand = new Random();
        int index = rand.nextInt(3); //valori intre 0 si 2 inclusiv
        attack = options[index];
        System.out.println(name + ": " + attack);
    }
}
