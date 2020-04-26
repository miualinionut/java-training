package code._4_student_effort;

public class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
        walk();
    }

    public Cat() {
        this(" ");
    }

    public void eat() {
        System.out.println(" pisica " + name + " mananca.");
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;

    }
   public void play()
   {
       System.out.println("Pisica "+ name+ " se joaca.");
   }

}
