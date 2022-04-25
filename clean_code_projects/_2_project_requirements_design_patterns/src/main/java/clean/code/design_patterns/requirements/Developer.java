package clean.code.design_patterns.requirements;

interface Worker {
    String getPosition();
    int getSalary();
}

public class Developer implements Worker {
    @Override
    public String getPosition() {
        return "Software Developer";
    }

    @Override
    public int getSalary() {
        return 2000;
    }
}


