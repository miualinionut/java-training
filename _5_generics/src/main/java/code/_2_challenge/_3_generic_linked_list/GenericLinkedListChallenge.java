package code._2_challenge._3_generic_linked_list;

public class GenericLinkedListChallenge {

  public static void main(String[] args) {
    String rootValue = "a";
    GenericList<String> list = new GenericList<>(rootValue);

    for (int i = 1; i < 10; i++) {
      list.insert(String.valueOf(Character.valueOf((char) (rootValue.charAt(0) + i))));
    }
    list.println();

  }
}
