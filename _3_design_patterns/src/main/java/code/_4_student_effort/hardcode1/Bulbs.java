package code._4_student_effort.hardcode1;

import java.util.List;

public class Bulbs implements BulbsDecorator{

    private ChristmasTree christmasTree;
    private int bulbsRow = 5;

    public Bulbs(ChristmasTree christmasTree){
        this.christmasTree = christmasTree;
        decorateBulbs();
    }

    @Override
    public void decorateBulbs() {
        int size = christmasTree.getSize();
        List<List<String>> bulbsTree = christmasTree.getterTree();
        for (int i = 0; i < size * 2; i ++ ){
            if(i > size - bulbsRow && i < size + bulbsRow){
                bulbsTree.get(bulbsRow).set(i,"B");
            }
        }
        this.christmasTree.setTree(bulbsTree) ;
    }

    @Override
    public List<List<String>> getTree() {
        return null;
    }

    @Override
    public void display() {

    }
}