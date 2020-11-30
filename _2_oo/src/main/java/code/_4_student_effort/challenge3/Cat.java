package code._4_student_effort.challenge3;

public class Cat  extends  Animal implements  Pet{

    public String name;

    public Cat( String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this("alunelu");
    }

    @Override
    public void eat() {
System.out.println("this cat," + name+ "can eat");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
       this.name = name;
    }

    @Override
    public void play()  {
        System.out.println("cat " + name + " is playing");
    }
}
