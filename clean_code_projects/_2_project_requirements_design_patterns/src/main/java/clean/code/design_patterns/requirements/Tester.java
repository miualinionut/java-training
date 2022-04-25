package clean.code.design_patterns.requirements;

public class Tester implements Worker {
    @Override
    public String getPosition() {
        return "QA Tester";
    }

    @Override
    public int getSalary() {
        return 1500;
    }
}
