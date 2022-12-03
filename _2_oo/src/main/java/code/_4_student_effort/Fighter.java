package code._4_student_effort;

public class Fighter {

    public final String name;
    public final Integer damage;
    public final Integer health;

    public Fighter(String name, Integer damage, Integer health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", health=" + health +
                '}';
    }
}
