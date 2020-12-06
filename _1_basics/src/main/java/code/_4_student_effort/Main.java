package code._4_student_effort;

public class Main {

  public static void main(String[] args) {
    //System.out.println("Hello World!");

//    ####Challenge 1###
//
//    Fighter fighter1 = new Fighter();
//    fighter1.name = "Jack";
//    fighter1.health = 100;
//    fighter1.damagePerAttack = 15;
//
//    Fighter fighter2 = new Fighter();
//    fighter2.name = "Greg";
//    fighter2.health = 100;
//    fighter2.damagePerAttack = 30;
//
//    BoxingMatch.fight(fighter1, fighter2);



//    ####Challenge 2###
//    Premiu oscar1990 = new Premiu("oscar", 1990);
//    Premiu oscar2000 = new Premiu("oscar", 2000);
//    Premiu oscar2010 = new Premiu("oscar", 2010);
//    Premiu oscar2018 = new Premiu("oscar", 2018);
//
//    Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
//    Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, new Premiu[]{oscar2010});
//    Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
//    Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
//    Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
//    Actor actorFaraPremii03 = new Actor("actor fara oscar 03", 20, new Premiu[]{});
//
//    Film film1 = new Film(1990, "film cu actori de oscar", new Actor[]{actorOscar1990, actorFaraPremii01});
//    Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
//    Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
//    Film film4 = new Film(2018, "film cu actori de oscar", new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
//    Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});
//
//    Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
//    Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});
//
//    Studio[] studioDatabase = new Studio[]{studio1, studio2};
//
//    for (int i=0; i < studioDatabase.length; i++){
//      //studioDatabase[i].getName(); //1st ex
//      //studioDatabase[i].getStudioName(); //2nd ex
//      studioDatabase[i].getMovieName(); //3rd ex
//    }


//    ####Challenge 3####

    Fish d = new Fish();
    Cat c = new Cat("Fluffy");
    Animal a = new Fish();
    Animal e = new Spider();
    Pet p = new Cat();

    System.out.println();

    d.eat();
    d.walk();

    System.out.println();

    c.eat();
    c.walk();
    c.play();
    c.getName();
    c.setName("Lisa");
    c.getName();

    Cat x = new Cat(); //called the no parameter constructor
    System.out.println("Cat x is named: " + x.name);

    System.out.println();

    System.out.println("Fish a has " + a.legs + " legs.");
    a.eat();
    a.walk();


    System.out.println();

    e.walk();
    e.eat();
  }
}
