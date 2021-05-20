package code._4_student_effort;

import code._4_student_effort._1_two_fighters.BoxingMatch;
import code._4_student_effort._1_two_fighters.Fighter;
import code._4_student_effort._2_movie_database.Actor;
import code._4_student_effort._2_movie_database.Film;
import code._4_student_effort._2_movie_database.Premiu;
import code._4_student_effort._2_movie_database.Studio;
import code._4_student_effort._3_animal_hierarchy.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        testBoxingMatch();
        testMovieDataBase();
        testAnimalHierarchy();

        System.out.println("\nAll tests have passed..." +
                "\nBut have YOU passed??(With your sanity intact after reading all the output)");
    }

    static void testBoxingMatch() {
        assert new BoxingMatch(new Fighter("A", 50, 10),
                new Fighter("B", 50, 10)).fight().equals("A");
        assert new BoxingMatch(new Fighter("A", 50, 10),
                new Fighter("B", 500, 1)).fight().equals("B");

        //For show..
        System.out.println(new BoxingMatch(new Fighter("Abi Talent", 50, 10),
                new Fighter("Mike Tyson", 250, 45)).fightDetailed());
        System.out.println("Boxing match is over. \n\n");
    }

    static void testMovieDataBase() {
        int varstaRomeoFantastik = Calendar.getInstance().get(Calendar.YEAR) - 1978;

        Premiu oscar1000 = new Premiu("oscar", 1000);
        Premiu oscar1995 = new Premiu("Oscar", 1995);
        Premiu sucarie2020 = new Premiu("sucarie", 2020);
        Premiu smecherie2020 = new Premiu("smecherie", 2020);
        Premiu golanie2020 = new Premiu("golanie", 2020);

        Actor actorNecunoscut = new Actor("Nimeni nu stie", -1, new Premiu[]{});
        Actor actorOscarDublu = new Actor("actor cu 2 oscaruri", 100, new Premiu[]{oscar1000, oscar1995});
        Actor actorSucar = new Actor("Ispilante Sentiment Brusli", 35, new Premiu[]{sucarie2020});
        Actor actorSmecher = new Actor("Geniloni Sfeclantoarsa", 40, new Premiu[]{smecherie2020});
        Actor actorGolan = new Actor("Giani Stilu Armani", 21, new Premiu[]{golanie2020});
        Actor actorBalaurSuprem = new Actor("Romeo Fantastik", varstaRomeoFantastik,
                new Premiu[]{sucarie2020, smecherie2020, golanie2020});

        Film filmObosit = new Film(1990, "film cu actori de oscar...", new Actor[]{actorOscarDublu});
        Film filmSiMaiObosit = new Film(1880, "Aoleu..", new Actor[]{actorNecunoscut});
        Film filmAdevarat = new Film(2021, "Film haladit cu actori adevarati ",
                new Actor[]{actorGolan, actorSucar, actorSmecher, actorBalaurSuprem});
        Film filmOk = new Film(2001, "film si cu actori de oscar si cu actori adevarati",
                new Actor[]{actorOscarDublu, actorBalaurSuprem});
        Film filmSmecher = new Film(2021, "Film doar cu Romeo Fantastik", new Actor[]{actorBalaurSuprem});

        Studio studioObosit = new Studio("studio vai de steaua lui", new Film[]{filmObosit, filmSiMaiObosit});
        Studio studioHaladit = new Studio("Studio adevarat", new Film[]{filmAdevarat, filmOk, filmSmecher});

        Studio[] studioDatabase = new Studio[]{studioObosit, studioHaladit};

        List<String> listWithNames = new ArrayList<>();
        

        //Find all the studios that have more than 2 movies
        System.out.println("Find all the studios that have more than 2 movies");
        for(Studio studio:studioDatabase)
            if(studio.hasEnoughMovies(2))
                listWithNames.add(studio.getNume());

        assert listWithNames.toString().equals("[Studio adevarat]");
        System.out.println(listWithNames);
        listWithNames.clear();

        //Find all studios that have movies with the actor named "actor cu 2 oscaruri" in them
        System.out.println("Find all studios that have movies with the actor named \"actor cu 2 oscaruri\" in them");
        for(Studio studio:studioDatabase)
            if(studio.hasActorName("actor cu 2 oscaruri"))
                listWithNames.add(studio.getNume());

        assert listWithNames.toString().equals("[studio vai de steaua lui, Studio adevarat]");
        System.out.println(listWithNames);
        listWithNames.clear();

        //Find all movies that have at least one actor with age greater than 50
        System.out.println("Find all movies that have at least one actor with age greater than 50:");
        for(Studio studio:studioDatabase)
            for(Film film:studio.getFilme())
                if(film.hasActorsOlderThan(50))
                    listWithNames.add(film.getNume());

        assert listWithNames.toString().equals("[film cu actori de oscar..., film si cu actori de oscar si cu actori adevarati]");
        System.out.println(listWithNames);
        System.out.println("\nMovie Database is over! \n\n");
    }


    static void testAnimalHierarchy() {
        //The creation of the world...
        List<Animal> spiderNest = new ArrayList<>();
        List<Pet> myPets = new ArrayList<>();
        List<Animal> myAnimals = new ArrayList<>();

        //The birth of life...
        Fish unimportantFish1 = new Fish();
        Fish unimportantFish2 = new Fish();
        Fish importantFish = new Fish("Fishy Fish");
        Animal wildShark = new Fish("Sharky Shark");

        Man man1 = new Man();
        Man man2 = new Man();
        Animal wildMan = new Man();

        Animal wildCat = new Cat("Wild Feline");
        Pet petCat1 = new Cat("Fluffy");
        Pet petCat2 = new Cat("Belly");
        Cat strayCat = new Cat("Jamal");
        Cat unimportantCat = new Cat();
        wildShark.eat();
        importantFish.eat();
        strayCat.walk();
        wildCat.eat();
        strayCat.eat();

        myPets.add(petCat1);
        myPets.add(petCat2);
        myPets.add(unimportantFish1);
        myPets.add(unimportantFish2);
        myPets.add(importantFish);
        
        Animal spider1 = new Spider();
        Animal spider2 = new Spider();
        Animal spider3 = new Spider();
        Spider spiderQueen = new Spider();

        spiderNest.add(spiderQueen);
        spiderNest.add(spider1);
        spiderNest.add(spider2);
        spiderNest.add(spider3);

        //And the destructive action of man... (and spider)
        System.out.println("The spider queen feeds...");
        spiderQueen.eat(spider1);
        spiderQueen.eat();
        System.out.println("The spiders migrate!");
        for(Animal spider:spiderNest)
            spider.walk();

        System.out.println("The spider queen eats a wild man and then attacks the pets!");
        spiderQueen.eat(wildMan);
        for(Pet pet:myPets)
            spiderQueen.eat(pet);
        System.out.println("Mankind fights back!");
        man1.kill(spider3);
        man2.kill(spider2);
        man1.kill(spiderQueen);
        System.out.println("Mankind now tames wild animals and forces them to walk to the tribe.");
        myAnimals.add(wildShark);
        myAnimals.add(wildCat);
        for(Animal animal:myAnimals)
            animal.walk();
        System.out.println("The humans try to feed and pet some animals!");
        strayCat.play();
        strayCat.eat();
        wildCat.eat();
        wildShark.eat();

        System.out.println("One man grows hungry and eats the stray cats!");
        man1.eat(strayCat);
        man1.eat(unimportantCat);
        System.out.println("AND THE SHARK!!!!");
        man1.eat(wildShark);
        System.out.println("The other man grows angry and does a terrible thing!");
        man2.kill(man1);
        System.out.println("\n Animal Hierarchy is over...\n\n");

    }
}
