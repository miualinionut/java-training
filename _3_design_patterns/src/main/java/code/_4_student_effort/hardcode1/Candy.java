package code._4_student_effort.hardcode1;

import java.util.List;

public class Candy implements CandyDecorator {

    private DecorableTree decorableTree;

    public Candy(DecorableTree decorableTree){
        this.decorableTree = decorableTree;
    }

    @Override
    public void decorateCandy() {

    }

    @Override
    public List<List<String>> getTree() {
        return null;
    }

    @Override
    public void display() {

    }
}
