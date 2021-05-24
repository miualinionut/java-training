package code._4_student_effort.TwoFightersOneWinner;

public class BoxingMatch
{
    private Fighter one, two;

    public BoxingMatch(Fighter one, Fighter two)
    {
        this.one = one;
        this.two = two;
    }

    public String fight()
    {
        while (one.getHealth() > 0 && two.getHealth() > 0)
        {
            one.attack(two);
            if (two.getHealth() <= 0)
                return one.getName();
            two.attack(one);
            if (one.getHealth() <= 0)
                return two.getName();
        }
        return "Eroare!";
    }
}
