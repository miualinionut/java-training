package code._3_in_class;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        Iterator<String> iter= list.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
            list.add("c");
        }
    }
}
