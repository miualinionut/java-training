package code._4_student_effort;

public class Main {


    public static void main(String[] args) {
        //---------------------------------------------- CODE CHALLENGE 1 -----------------------------------------------//

        Fighter playerOne = new Fighter("Lucian Bute", 100, 11);
        Fighter playerTwo = new Fighter("Sarbu Ioan", 100, 10);

        System.out.println("Winner of the match: ");
        BoxingMatch calificare = new BoxingMatch(playerOne, playerTwo);
        System.out.println(calificare.fight());

        //---------------------------------------------- CODE CHALLENGE 2 -----------------------------------------------//

        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 1990);
        Premiu oscar2010 = new Premiu("oscar", 1990);
        Premiu oscar2018 = new Premiu("oscar", 1990);

        Actor actorOscar1990 = new Actor("Actor cu doua oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("Actor cu oascar din 2000", 55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("Actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("Actor fara oscar 01", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("Actor fara oscar 02", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("Actor fara oscar 03", 20, new Premiu[]{});

        Film film1 = new Film(1990, "film cu actori de oscar", new Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film(2018, "film cu actori de oscar", new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
        Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

        Studio[] studioDatabase = new Studio[]{studio1, studio2};

        System.out.print("\nStudios with more than two movies: ");
        for(Studio studio: studioDatabase) {    ///Stage 3 -> 1
            if (studio.getNrOfMovies() > 2) {
                System.out.println(studio.getNume());
            }
        }

        System.out.print("Studios where \"Actor cu doua oscaruri\" played: ");
        for(Studio studio: studioDatabase) {
            for(Film film: studio.getFilme()){
                for(Actor actor: film.getActori()) {
                    if (actor.getNume().equals("Actor cu doua oscaruri")) {
                        System.out.println(studio.getNume());
                    }
                }
            }
        }

        System.out.println("Movies in which actors over 50 years old had played: ");
        for(Studio studio: studioDatabase) {
            for (Film film : studio.getFilme()) {
                for (Actor actor : film.getActori()) {
                    if (actor.getVarsta() > 50) {
                        System.out.println(" -> " + film.getNume());
                        break;
                    }
                }
            }
        }

        //---------------------------------------------- CODE CHALLENGE 3 -----------------------------------------------//

        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        //-- We play with fishy fish --
        System.out.println("\n\nWe'll play with the Fish a little: ");
        System.out.println("Legs: " + d.legs);
        d.walk();
        d.eat();
        d.play();
        System.out.println("Let's give the fish a name... How about Goldish?");
        d.setName("Goldish");
        System.out.println("Let's see now if it worked... The fish name is: " + d.getName() + "\n");

        //-- We play with neko --
        System.out.println("Let's see what the cat is doing right now: ");
        System.out.println("Legs: " + c.legs);
        System.out.println("Seems that " + c.getName() + " didn't lose any of them...");
        c.walk();
        System.out.println("Let's call her Neko");
        c.setName("Neko");
        System.out.println( c.getName() + " seems hungry. Let's give her some food");
        c.eat();
        System.out.println("Now, " + c.getName() + " seems full and playful");
        c.play();

        //-- Zoo 1 --
        System.out.println("\nFishy Animal subject test 1 initiated: ");
        a.walk();
        a.eat();

        System.out.println("\nSpider Animal subject test 1 initiated: ");
        e.walk();
        e.eat();

        System.out.println("\nCat Pet subject test 1 initiated: ");
        p.setName("Fluffy");
        System.out.println("Name: " + p.getName());
        p.play();

        Fish aCast = (Fish)a;
        System.out.println("\nLet's see what the Fishy Animal subject can do after casting:");
        aCast.play();
        aCast.setName("Xd");
        aCast.walkingFish();
        System.out.println(aCast.getName());

        Cat pCast = (Cat)p;
        System.out.println("\nLet's see what the Cat Pet subject can do after casting:");
        pCast.eat();
        pCast.walk();

        System.out.print("\nCalling Fishy super walk:");
        d.walkingFish();

        //----------------------------------------------  The End  -----------------------------------------------//

    }

}