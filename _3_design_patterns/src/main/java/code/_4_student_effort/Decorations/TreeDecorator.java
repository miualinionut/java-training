package code._4_student_effort.Decorations;

import java.util.ArrayList;
import java.util.List;

public abstract class TreeDecorator implements DecorableTree {
    protected int positionInTree;
    protected DecorableTree tree;

    public TreeDecorator(int positionInTree, DecorableTree tree) {
        this.positionInTree = positionInTree;
        this.tree = tree;
    }

    public List<List<String>> getTree(){
        List<List<String>> originalUnmodifiableTree = tree.getTree();
        List<List<String>> decoratedTree = new ArrayList<>(originalUnmodifiableTree);
        int left = decoratedTree.get(positionInTree).indexOf("<");
        int right = decoratedTree.get(positionInTree).indexOf(">");

        List<String> originalUnmodifiableTreeRow = decoratedTree.get(positionInTree);
        List<String> decoratedTreeRow = new ArrayList<>(originalUnmodifiableTreeRow);
        for (int i = left + 1; i < right; i++){
            decoratedTreeRow.set(i,getDecoration());
        }
        decoratedTree.set(positionInTree, decoratedTreeRow);
        return decoratedTree;
    }

    public abstract String getDecoration();

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
