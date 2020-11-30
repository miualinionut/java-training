package code._4_student_effort.two_fighters;

public class BoxingMatch {
    Fighter f1, f2;
    public BoxingMatch(Fighter f1, Fighter f2) {
        this.f1 = f1;
        this.f2=f2;
    }
    public String fight(){
        String fighterName = "";
        if (f1.damagePerAttack == 0 && f2.damagePerAttack ==0)
            return "nu se poate";
        while (f1.health > 0 && f2.health > 0){
            f1.attack(f2);
            if (f2.health == 0) {
                fighterName = f1.name;
                break;
            }
            f2.attack(f1);
            if (f1.health == 0)
                fighterName = f2.name;
        }
        return fighterName;
    }
}
