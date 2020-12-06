package code._4_student_effort.hard_challenge_1_decorations;

public class Main {
    public static void main(String[] args) {
        DecorableTree christmasTree = new ChristmasTree();
        DecorableTree decoratedTree = christmasTree;

        decoratedTree = new Garland(2, decoratedTree);
        decoratedTree = new Bulbs(5, decoratedTree);
        decoratedTree = new Candy(6, decoratedTree);
        decoratedTree = new Candy(9, decoratedTree);
        christmasTree.display();
        decoratedTree.display();

    }
}
