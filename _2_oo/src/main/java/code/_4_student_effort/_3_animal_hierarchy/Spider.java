package code._4_student_effort._3_animal_hierarchy;

public class Spider extends Animal {
    public Spider() {
        super(8);
    }

    public void eat() {
        System.out.println("A spider has eaten...");
    }

    public void eat(Animal prey){
        System.out.println("An animal with " + prey.legs + " legs has been eaten by a spider...");
    }
    
    public void eat(Pet prey){
        System.out.println("Pet " + prey.getName() + " has been eaten by a spider...");
    }
}
