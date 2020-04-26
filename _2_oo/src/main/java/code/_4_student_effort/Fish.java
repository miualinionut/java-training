package code._4_student_effort;

public class Fish extends Animal implements Pet {
    private String name;

    Fish() {
        super(0);
        {
            if (this.legs == 0) {
                System.out.println("Pestele are " + legs + " picioare si nu poate merge");
            }
        }
    }


    @Override
    public void eat() {
        System.out.println("Pestele mananca.");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Pestele inoata.");
    }
}


