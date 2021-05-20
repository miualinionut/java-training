package code._4_student_effort._3_animal_hierarchy;

public abstract class Animal {
    int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public void  walk() {
        String[] className = this.getClass().toString().split("\\.");
        String animalType = className[className.length-1];
        System.out.println(animalType + ": I have walked using all my " + legs + " legs!");
    }

    abstract public void eat();

}

