package code._3_in_class;

public class Main {

    public static void main(String[] args) {}
        static LinkedBinaryTree<Integer> loadTreeFromArray(Integer[] elements){
            LinkedBinaryTree<Integer> tree = new LinkedBinaryTree<Integer> () ;
            Position<Integer> root = tree.addRoot (elements [0]);
            createSubNodes(root, 1, tree, elements);
            return tree;
        }
        static void createSubNodes (Position<Integer> parent, Integer idx,
                LinkedBinaryTree<Integer> tree, Integer[] elements) {
            if (idx*2-1 < elements.length)
                createSubNodes (tree.addLeft(parent, elements [idx*2-1]), idx*2, tree, elements);
            if (idx*2 < elements.length)
                createSubNodes (tree.addRight(parent, elements [idx*2]), idx*2+1, tree, elements);}

        static <E> String toStringTreePositions(Iterable<Position<E>> positions) {
            String treeString ="";
            for (Position<E> p : positions)
                treeString += p.getElement() + ",";
            return treeString;
        }

        public static void main(String[] args) {
            Integer[] elements = new Integer[] {1, 2, 3, 4, null, 6, 7};
            LinkedBinaryTree<Integer > tree = loadTreeFromArray(elements) ;
            System.out.println("tree positions : " + toStringTreePositions(tree.postorder()));}

    }
}
