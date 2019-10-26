package code._2_challenge.hard._1_decorations;

public class DecorationGarland extends Decoration {
  public DecorationGarland(int positionInTree, DecorableTree christmasTree) {
    super(positionInTree, christmasTree);
  }

  @Override
  public String getDecoration() {
    return "G";
  }
}