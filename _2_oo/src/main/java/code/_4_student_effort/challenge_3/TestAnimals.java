package code._4_student_effort.challenge_3;

public class TestAnimals {
    public static void testSpiderMethods(Spider spider) {
        spider.walk();
        spider.eat();
        System.out.println();
    }

    public static void testCatMethods(Cat cat) {
        cat.walk();
        cat.eat();
        cat.setName("Pinky");

        System.out.println("The cat's new name is:" + cat.getName());

        cat.play();
        System.out.println();
    }

    public static void testFishMethods(Fish fish) {
        fish.walk();
        fish.eat();
        fish.play();
        System.out.println();
    }

    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat("Nikey");

        testFishMethods(d);
        testCatMethods(c);
        a.walk();
        e.eat();
        System.out.println(p.getName());
    }
}
