package code._3_in_class;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Boxer rocky = new Boxer("Rocky Balboa", 100,10);
        Boxer apollo = new Boxer("Apollo Creed",100,10);

        while(rocky.sanatate>0 && apollo.sanatate>0){
            Random random = new Random();
            int cineDa=random.nextInt(2);

            if(cineDa==1)
                rocky.ataca(apollo);
            else
                apollo.ataca(rocky);

            System.out.println("Viata " + rocky.nume+":"+ rocky.sanatate);
            System.out.println("Viata " + apollo.nume+":"+ apollo.sanatate);
        }

        if(rocky.sanatate<=0)
            System.out.println(apollo.nume + " a castigat");
        else
            System.out.println(rocky.nume + " a castigat");

    }
}