package code._4_student_effort;

import java.util.Random;

public class DefensiveFighter extends Fighter {


    public DefensiveFighter(String name, Integer damage, Integer health,Integer defence) {
        super(name, damage, health,defence);
        this.defence=3;
    }
}
