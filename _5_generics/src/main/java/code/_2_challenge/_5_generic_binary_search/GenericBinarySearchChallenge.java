package code._2_challenge._5_generic_binary_search;

public class GenericBinarySearchChallenge {

  public static void main(String[] args) throws ArrayNotSortedException {
    Integer[] list01 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Integer[] list02 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    System.out.println(binarySearch(list01, -30) == false);
    System.out.println(binarySearch(list02, -30) == false);
    System.out.println(binarySearch(list01, 30) == false);
    System.out.println(binarySearch(list02, 30) == false);
    for (int i = 1; i <= 10; i++) {
      System.out.println(binarySearch(list01, i) == true);
      System.out.println(binarySearch(list02, i) == true);
    }
  }

  public static <T extends Comparable> boolean binarySearch(T[] list, T value) throws ArrayNotSortedException {
    int direction = getSortingDirection(list);
    if (isSorted(list, direction)) {
      return binarySearch(list, value, direction, 0, list.length - 1);
    } else {
      return false;
    }
  }

  public static <T extends Comparable> int getSortingDirection(T[] list) {
    int direction = 0;
    for (int i = 0; i < list.length - 1; i++) {
      direction = list[i].compareTo(list[i + 1]);
      if (direction != 0) break;
    }
    return direction;
  }

  public static <T extends Comparable> boolean isSorted(T[] list, int direction) throws ArrayNotSortedException {
    if (list.length > 1) {
      for (int i = 0; i < list.length - 1; i++) {
        if (list[i].compareTo(list[i + 1]) != direction) {
          throw new ArrayNotSortedException("list is not sorted!");
        }
      }
    }
    return true;
  }

  private static <T extends Comparable> boolean binarySearch(T[] list, T value, int direction, int start, int end) {
    int midIndex = start + (end - start) / 2;

    if (value.equals(list[midIndex])) {
      return true;
    } else if (end == start) {
      return false;
    } else if (compareValuesHasSameSignAsDirection(value, list[midIndex], direction)) {
      return binarySearch(list, value, direction, start, midIndex);
    } else {
      return binarySearch(list, value, direction, midIndex + 1, end);
    }
  }

  private static <T extends Comparable> boolean compareValuesHasSameSignAsDirection(T value, T mid, Integer direction) {
    return Math.signum(value.compareTo(mid)) == Math.signum(direction);
  }

}
