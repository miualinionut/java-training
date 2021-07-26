package code._4_student_effort.HardCodeChallange1;

public class Main {
    public static void main(String[] args) {
        DecorableTree christmasTree = new ChristmasTree();

        DecorableTree decoratedChristmasTree = christmasTree;
        decoratedChristmasTree = new DecorationBulb(3, decoratedChristmasTree);
        decoratedChristmasTree = new DecorationCandy(6, decoratedChristmasTree);
        decoratedChristmasTree = new DecorationGarland(8, decoratedChristmasTree);

        christmasTree.display();
        decoratedChristmasTree.display();
    }
}
