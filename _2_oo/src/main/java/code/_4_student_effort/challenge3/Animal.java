package code._4_student_effort.challenge3;

abstract class Animal {

    protected int legs; //records the number of legs for this animal

    public Animal(){};

    protected Animal(int legs){
        this.legs = legs;

    }

    abstract void eat();

   void walk(){
       System.out.println("Animalele merg folosind " + legs + " picioare");
   }


}
