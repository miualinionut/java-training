package code._4_student_effort._2_pairs;

class Pair<S extends Shoe> {
  private S first;
  private S second;

  public Pair(S firstElement, S secondElement) {
    first = firstElement;
    second = secondElement;
    match(firstElement, secondElement);
  }

  private void match(S firstElement, S secondElement) {
    if (firstElement.getSize() != secondElement.getSize()) {
      throw new SizesDoNotMatchException("sizes do not match");
    }
    if (!firstElement.getColor().equals(secondElement.getColor())) {
      throw new SizesDoNotMatchException("colors do not match");
    }
  }

  public S getFirst() {
    return first;
  }

  public S getSecond() {
    return second;
  }
}
