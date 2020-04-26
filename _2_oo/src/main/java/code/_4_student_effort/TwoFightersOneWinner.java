package code._4_student_effort;

public class TwoFightersOneWinner{
        public static void main(String[] args) {
            Fighter f1= new Fighter(100,"Smarandau",5);
            Fighter f2= new Fighter(120,"Petrisor",4);

            BoxingMatch box= new BoxingMatch(f1,f2);
            box.fight();
        }
}
