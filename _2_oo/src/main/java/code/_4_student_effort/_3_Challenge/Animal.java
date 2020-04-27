package code._4_student_effort._3_Challenge;

abstract class Animal { //clasa abstracta ascunde detaliile de user
    //state             //arata doar functionalitatile
    protected int legs;  //nu poate fi instantiata

    public Animal(int legs) {
        this.legs = legs;
    }

    void walk(){
        System.out.println("animalul merge cu" + this.legs);
    };
    abstract void eat();  //poate avea metode abs sau nu
}

class Spider extends Animal{
    public Spider() {
        super(8);
    }

    @Override
    void eat() {
        System.out.println("Mananca gandaci");
    }
}


