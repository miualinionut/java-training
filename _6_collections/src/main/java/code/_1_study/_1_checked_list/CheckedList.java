package code._1_study._1_checked_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckedList {

  public static void main(String[] args) {
    List myList = new ArrayList();
    myList.add("one");
    myList.add("two");
    myList.add("three");
    myList.add("four");
    List chkList = Collections.checkedList(myList, String.class);
    System.out.println("Checked list content: " + chkList);

    //you can add any type of elements to myList object
    myList.add(10);
    //you cannot add any type of elements to chkList object
    chkList.add(10); //throws ClassCastException, because it checks the element's type
  }
}
