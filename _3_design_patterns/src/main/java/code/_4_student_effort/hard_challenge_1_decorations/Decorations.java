package code._4_student_effort.hard_challenge_1_decorations;

import java.util.ArrayList;
import java.util.List;

public abstract class Decorations implements DecorableTree{
    int rowInTree;
    DecorableTree tree;

    public Decorations(int rowInTree, DecorableTree tree){
        this.rowInTree = rowInTree;
        this.tree = tree;
    }

    public abstract String getDecoration();

    @Override
    public List<List<String>> getTree() {
        List<List<String>> newDecoratedTree = new ArrayList<>(tree.getTree());
        List<String> newDecoratedRow = new ArrayList<>(newDecoratedTree.get(rowInTree));

        int left = newDecoratedRow.indexOf("<");
        int right = newDecoratedRow.indexOf(">");

        for(int i = left + 1; i < right; i++){
            newDecoratedRow.set(i, getDecoration());
        }
        newDecoratedTree.set(rowInTree, newDecoratedRow);

        return newDecoratedTree;
    }

    @Override
    public void display() {
        List<List<String>> newDecoratedTree = this.getTree();
        for(int i = 0; i < newDecoratedTree.size(); i++){
            for(int j = 0; j < newDecoratedTree.get(i).size(); j++){
                System.out.print(newDecoratedTree.get(i).get(j));
            }
            System.out.println();
        }
    }
}
