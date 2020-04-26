package code._4_student_effort.Two_fighters;

public class BoxingMatch {
   private Fighter a1;
   private Fighter a2;
    public String remiza="Remiza!";

    BoxingMatch(Fighter a, Fighter b)
    {
        this.a1=a;
        this.a2=b;
    }

    public String fight()
    {
        while(a1.health>0&&a2.health>0)
        {
            a1.attack(a2);
            a2.attack(a1);
        }
        if(a1.health<=0&&a2.health<=0)
        {
            return remiza;
        }
        else if(a1.health<=0)
        {
            return a2.name;
        }

            return a1.name;

    }

    public static void main(String[] args) {
        Fighter a1= new Fighter ("Gigel",100,5);
        Fighter a2= new Fighter ("Patrunjel",100,5);
        BoxingMatch lupta= new BoxingMatch(a1,a2);
        String rezultat=lupta.fight();
        System.out.println(rezultat);
    }
}

