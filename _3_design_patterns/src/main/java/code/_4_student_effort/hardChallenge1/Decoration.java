package code._4_student_effort.hardChallenge1;

import java.util.ArrayList;
import java.util.List;

public abstract class Decoration implements DecorableTree{
    DecorableTree christmasTree;
    int row;
    List<List<String>> undecorated;
    List<List<String>> decorated;

    public Decoration(DecorableTree christmasTree, int row) {
        this.christmasTree = christmasTree;
        this.row=row;
        undecorated=this.christmasTree.getTree();
        decorated=new ArrayList<>(undecorated);
        decorated=getTree();
    }


    @Override
    public List<List<String>> getTree() {


        List<String> undecoratedRow=undecorated.get(row);
        List<String> decoratedRow=new ArrayList<>(undecoratedRow);
        for(int i=undecoratedRow.indexOf("<")+1;i<undecoratedRow.indexOf(">");i++) {
            decoratedRow.set(i, getDecoration());

        }

        decorated.set(row,decoratedRow);

        return decorated;

    }

    @Override
    public void display() {
        for (int i = 0; i < decorated.size(); i++) {
            for (int j = 0; j < decorated.get(i).size(); j++) {
                System.out.print(decorated.get(i).get(j));
            }
            System.out.println();
        }
    }

    abstract public String getDecoration();
}
