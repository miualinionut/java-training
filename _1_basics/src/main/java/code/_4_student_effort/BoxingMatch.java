package code._4_student_effort;

public class BoxingMatch {
    Fighter opponent1;
    Fighter opponent2;

    public BoxingMatch(Fighter opponent1, Fighter opponent2){
        this.opponent1 = opponent1;
        this.opponent2 = opponent2;
    }

    public void fight(){

        while((opponent1.health >=0) && (opponent2.health >=0)){
            Fighter.attack(opponent1, opponent2);

            if(opponent2.health <= 0){
                System.out.println(opponent1.name + " a castigat!");
                break;
            }

            Fighter.attack(opponent2,opponent1);
            if (opponent1.health <= 0) {
                System.out.println(opponent2.name + " a castigat!");
                break;
            }
        }

    }


}
