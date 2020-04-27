package code._4_student_effort._3_Challenge;

public class Cat extends Animal implements Pet {
    private String nume;

    public Cat(String nume){
        super(4); //apeleaza contructorul din parinte
        this.nume = nume;
    }

    public Cat() {
        this("");
    }

    @Override
    public String getName(){
        return nume;
    }

    @Override
    public void setName(String s){
        this.nume = s;
    }

    @Override
    public void play(){
        System.out.println("Pisica" + nume + " se joaca cu soarecii");
    }

    @Override
    void eat() {
        System.out.println("Pisica" + nume + "mananca peste");
    }
}
