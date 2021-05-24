package code._4_student_effort;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here

        //Code challenge 1 - Two Fighters

        /*Fighter fighter1 = new Fighter();
        Fighter fighter2 = new Fighter();
        fighter1.heath=100;
        fighter2.heath=100;
        fighter2.damagePerAttack=30;
        fighter1.damagePerAttack=20;
        BoxingMatch boxingMatch = new BoxingMatch(fighter1,fighter2);
        System.out.println(boxingMatch.fight());*/



        //Code Challenge 2 - Movie Database


        /*Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990,oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2010", 55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 03", 20, new Premiu[]{});

        Film film1 = new Film(1990, "film cu actori de oscar", new Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01,actorFaraPremii02,actorFaraPremii03});
        Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[]{actorFaraPremii01,actorFaraPremii02,actorFaraPremii03});
        Film film4 = new Film(2018, "film cu actori de oscar", new Actor[]{actorOscar2010,actorOscar2018,actorFaraPremii02});
        Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02,actorFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[]{film1,film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3,film4,film5});

        Studio[] studioDatabase = new Studio[]{studio1,studio2};

        for(Studio studio:studioDatabase){
            if(studio._filme.length>2)
                System.out.println("Acest studio a publicat mai mult de 2 filme: "+studio._nume);
        }
        for(Studio studio:studioDatabase){
            int ok=0;
            for(Film film:studio._filme){
                for(Actor actor:film._actori){
                    if(actor._nume=="actor cu 2 oscaruri")
                        ok=1;
                }
            }
            if(ok==1)
                System.out.println("In acest studio joaca actorul cu numele __actor cu 2 oscaruri__: "+studio._nume);
        }

        Film[] filmDatabase = new Film[]{film1,film2,film3,film4,film5};

        for(Film film:filmDatabase){
            int ok2=0;
            for(Actor actor:film._actori){
                if(actor._varsta>=50)
                    ok2=1;
            }
            if(ok2==1)
                System.out.println("In acest film joaca macar un actor cu varsta peste 50 de ani: "+film._nume);
        }*/





    }
}
