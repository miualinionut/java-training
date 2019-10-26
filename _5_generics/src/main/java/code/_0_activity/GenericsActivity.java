package code._0_activity;

public class GenericsActivity {

  static class BubleSort {
    public <T extends Comparable> void sort(T[] list) {
      for (int i = 0; i < list.length - 1; i++) {
        for (int j = i + 1; j < list.length; j++) {
          if (list[i].compareTo(list[j]) > 0) {
            T temp = list[i];
            list[i] = list[j];
            list[j] = temp;
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    BubleSort bubleSort = new BubleSort();

    Integer[] i = new Integer[]{3, 2, 6};
    Short[] s = new Short[]{3, 2, 6};
    Byte[] b = new Byte[]{3, 2, 6};
    Double[] d = new Double[]{3d, 2d, 6d};

    bubleSort.sort(i);
    bubleSort.sort(s);
    bubleSort.sort(b);
    bubleSort.sort(d);
  }

}
