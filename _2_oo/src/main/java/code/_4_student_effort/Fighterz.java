package code._4_student_effort;

import code._2_challenge._1_two_fighters.Fighter;

public class Fighterz {
    private int health, atkdmg;
    private String name;
    public Fighterz(int h,int a,String n){
        health=h;
        atkdmg=a;
        name=n;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public void setAtkdmg(int atkdmg) {
        this.atkdmg = atkdmg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAtkdmg() {
        return atkdmg;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void atk(Fighterz opponent){
        opponent.setHealth(opponent.getHealth()-this.atkdmg);
    }

}
