package code._4_student_effort.HardCodeChallange1;

import java.util.ArrayList;
import java.util.List;

public abstract class Decoration implements DecorableTree{
    private int rowInTree;
    private DecorableTree treeToDecorate;

    public Decoration(int rowInTree, DecorableTree treeToDecorate){
        this.rowInTree = rowInTree;
        this.treeToDecorate = treeToDecorate;
    }

    @Override
    public List<List<String>> getTree(){
        List<List<String>> decoratedTree = new ArrayList<>(treeToDecorate.getTree());
        int leftIndex = decoratedTree.get(rowInTree).indexOf("<");
        int rightIndex = decoratedTree.get(rowInTree).indexOf(">");

        List<String> originalTreeRow = decoratedTree.get(rowInTree);
        List<String> decoratedTreeRow = new ArrayList<>(originalTreeRow);

        for(int i = leftIndex + 1; i < rightIndex; i++){
            decoratedTreeRow.set(i, getDecoration());
        }

        decoratedTree.set(rowInTree, decoratedTreeRow);

        return decoratedTree;
    }

    public abstract String getDecoration();

    @Override
    public void display() {
        List<List<String>> tree = this.getTree();
        for (int i = 0; i < tree.size(); i++) {
            for (int j = 0; j < tree.get(i).size(); j++) {
                System.out.print(tree.get(i).get(j));
            }
            System.out.println();
        }
    }
}
