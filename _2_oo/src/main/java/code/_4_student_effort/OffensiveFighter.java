package code._4_student_effort;

public class OffensiveFighter extends Fighter {

    public OffensiveFighter(String name, Integer damage, Integer health, Integer defence) {
        super(name, damage, health, defence);
        this.defence=1;
    }
}
