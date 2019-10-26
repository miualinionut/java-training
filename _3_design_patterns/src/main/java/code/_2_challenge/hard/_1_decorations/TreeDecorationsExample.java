package code._2_challenge.hard._1_decorations;

public class TreeDecorationsExample {
  public static void main(String[] args) {
    DecorableTree christmasTree = new ChristmasTree();

    DecorableTree decoratedTree = christmasTree;
    decoratedTree = new DecorationCandy(3, decoratedTree);
    decoratedTree = new DecorationBulb(6, decoratedTree);
    decoratedTree = new DecorationGarland(8, decoratedTree);

    decoratedTree.display();
    christmasTree.display();
  }
}






