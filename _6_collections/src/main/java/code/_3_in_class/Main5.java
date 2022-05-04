package code._3_in_class;

import java.util.TreeSet;

public class Main5 {
    public static void main(String[] args) {
        TreeSet tree=new TreeSet<>();
        tree.add("Roots");
        tree.add("Stem");
        tree.add("Branch");
        tree.add("Leaves");
        tree.remove("fruits");
        System.out.println(tree);
    }
}
