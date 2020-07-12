package code._4_student_effort.hardcode1;

import java.util.List;

public class Garland implements GarlandDecorator {

    private DecorableTree decorableTree;

    public Garland(DecorableTree decorableTree){
        this.decorableTree = decorableTree;
    }

    @Override
    public void decorateGarland() {

    }

    @Override
    public List<List<String>> getTree() {
        return null;
    }

    @Override
    public void display() {

    }
}
