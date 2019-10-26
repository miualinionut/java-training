package code._2_challenge._4_generic_iterator;

public class GenericIteratorChallenge {

  public static void main(String[] args) {
    Sock[] socks = new Sock[10];
    Glove[] gloves = new Glove[10];
    for (int i = 0; i < 10; i++) {
      socks[i] = new Sock(i + 1, "blue");
      gloves[i] = new Glove(i + 1, "maroon");
    }

    IArrayIterator<Sock> socksIterator = new ArrayIterator<>(socks);
    while (socksIterator.hasNext()) {
      System.out.println(socksIterator.next());
    }
    IArrayIterator<Glove> glovesIterator = new ArrayIterator<>(gloves);
    while (glovesIterator.hasNext()) {
      System.out.println(glovesIterator.next());
    }
  }

}
