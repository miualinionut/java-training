package code._4_student_effort.Two_Fighters;

public class BoxingMatch {

    public static String fight(Fighter f1, Fighter f2){

        boolean turn = true; //true - f1 ; false - f2
        String s = "";

        while (f1.getHealth()>0 && f2.getHealth()>0){
            if(turn){
                f1.attack(f2);
                turn = false;

            }
            else if(!turn){
                f2.attack(f1);
                turn = true;
            }
        }

        if(f1.getHealth() <= 0) s += f2.getName();
        else if(f2.getHealth() <= 0) s += f1.getName();

        return s;
    }

    public static void main(String[] args) {

        Fighter f1 = new Fighter("John Cena", 100, 10);
        Fighter f2 = new Fighter("Catalin Morosanu", 100, 15);

        System.out.println(fight(f1,f2));

    }
}
