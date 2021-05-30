package code._4_student_effort.Decorations;

public class DecorateTest {
    public static void main(String[] args) {
        DecorableTree emptyTree = new ChristmasTree();

        DecorableTree decoratedTree = emptyTree;
        decoratedTree = new Candy(3, decoratedTree);
        decoratedTree = new Bulbs(6, decoratedTree);
        decoratedTree = new Garland(8, decoratedTree);

        emptyTree.display();
        decoratedTree.display();
    }
}
