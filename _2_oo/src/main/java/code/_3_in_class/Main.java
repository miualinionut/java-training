package code._3_in_class;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here
        Boxer gheorghe=new Boxer("Gheorghe",100,10);
        Boxer mircea=new Boxer("Mircea");


        Random random =new Random();

        startBoxingMatch(gheorghe, mircea, random);
        anuntareCastigator(gheorghe,mircea);

    }

    private static void anuntareCastigator(Boxer gheorghe,Boxer mircea) {
        if (gheorghe.health<=0){
        System.out.println(mircea.nume + " a castigat meciul."    );
    }
    else {System.out.println(gheorghe.nume+" a castigat meciul.");}
    }

    private static void startBoxingMatch(Boxer gheorghe, Boxer mircea, Random random) {
        while (gheorghe.health>0 && mircea.health>0){
            int zeroOrOne= random.nextInt(2);
            if(zeroOrOne==0){
                gheorghe.fight(mircea);}
            else{
                mircea.fight(gheorghe);
        }
        }
    }
}