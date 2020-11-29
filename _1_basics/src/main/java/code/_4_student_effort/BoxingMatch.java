package code._4_student_effort;

public class BoxingMatch {
    Fighter f1,f2;
    public BoxingMatch(Fighter f1,Fighter f2){
        this.f1 = f1;
        this.f2 = f2;
    }
    public String fight() throws InterruptedException {
        while(f1.health > 0 && f2.health > 0){
            f1.health = f2.attack(f1.name,f1.health);
            Thread.sleep(200);
            if(f1.health > 0){
                f2.health = f1.attack(f2.name,f2.health);
                Thread.sleep(200);
            }

        }
        if(f1.health <= 0 )
            return f2.name;
        else return f1.name;
    }
}
