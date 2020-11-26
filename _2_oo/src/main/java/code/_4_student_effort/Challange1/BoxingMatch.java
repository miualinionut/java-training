package code._4_student_effort.Challange1;

public class BoxingMatch {
    Fighter firstFighter;
    Fighter secondFighter;

    public BoxingMatch(Fighter fighter1, Fighter fighter2)
    {
        firstFighter = fighter1;
        secondFighter = fighter2;
    }

    public String fight()
    {
        while(firstFighter.getHealth() > 0 && secondFighter.getHealth() > 0)
        {
            firstFighter.attack(secondFighter);
            if(secondFighter.getHealth() <= 0)
                break;
            else
                secondFighter.attack(firstFighter);
        }
        if(firstFighter.getHealth() <= 0)
            return secondFighter.getName();
        else
            return firstFighter.getName();
    }

}
