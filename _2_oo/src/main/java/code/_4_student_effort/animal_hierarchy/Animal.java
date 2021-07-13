package code._4_student_effort.animal_hierarchy;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public Animal() {

    }

    public void eat(){};
    public void walk(){
        if(legs == 2){
            System.out.println("Animalul este biped");
        }
        if(legs == 0){
            System.out.println("Animalul nu are picioare, se dplaseaza altfel");
        }
        if(legs==4){
            System.out.println("Animalul merge pe 4 picioare");
        }
        if(legs>4){
            System.out.println("Animalul are mai mult de 4 picioare");
        }
        System.out.println("Numarul de picioare este "+ legs);
    };

}
