
public class BoxingMatch {

    Fighter f1, f2;

    public BoxingMatch(Fighter f1, Fighter f2) {
    this.f1=f1;
    this.f2=f2;
    }

    public void fight(Fighter f1, Fighter f2)
    {
        int f1_sum =0, f2_sum=0;
        while (f1.getHeath()>=0 || f2.getHeath()>=0) {

            if (f1.attack(f2) > f2.attack(f1))
                f2_sum++;
            else
                f1_sum++;
        }
        if(f1_sum>f2_sum)
            System.out.println("Fighter: " + f1.getName() + " wins");
        else
            System.out.println("Fighter: " + f2.getName() + " wins");

    }
}
