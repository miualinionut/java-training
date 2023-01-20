package clean.code.design_patterns.requirements;

public class MainAnimal {

    public static void main(String[] args) {

        Animal animal1 = AnimalFactory.getAnimal("dog");
        System.out.println("Dog : ");
        animal1.speak();
        animal1.color();
        animal1.kilograms();
        if(animal1.isTame()==false)
            System.out.println("Is not tame.\n");
        else System.out.println("Is tame.\n");


        Animal animal2 = AnimalFactory.getAnimal("cat");
        System.out.println("Cat : ");
        animal2.speak();
        animal2.color();
        animal2.kilograms();
        if(animal2.isTame()==false)
            System.out.println("Is not tame.\n");
        else System.out.println("Is tame.\n");

        Animal animal3 = AnimalFactory.getAnimal("rabbit");
        System.out.println("Rabbit : ");
        animal3.speak();
        animal3.color();
        animal3.kilograms();
        if(animal3.isTame()==false)
            System.out.println("Is not tame.\n");
        else System.out.println("Is tame.\n");


        Animal animal4 = AnimalFactory.getAnimal("snake");
        System.out.println("Snake : ");
        animal4.speak();
        animal4.color();
        animal4.kilograms();
        if(animal4.isTame()==false)
            System.out.println("Is not tame.\n");
        else System.out.println("Is tame.\n");

    }

    }


