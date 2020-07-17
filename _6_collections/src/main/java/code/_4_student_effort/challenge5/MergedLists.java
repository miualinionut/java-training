package code._4_student_effort.challenge5;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class MergedLists {

    public static List<Integer> mergeLists(List<Integer> l1, List<Integer> l2) {

        List<Integer> mergedList = new ArrayList<>(l1);

        for (int i = 0; i < l2.size(); i++) {
            boolean ok = true;
            for (int j = 0; j < mergedList.size(); j++) {
                if (l2.get(i).equals(mergedList.get(j))) {
                    ok = false;
                }
            }
            if(ok) mergedList.add(l2.get(i));
        }

        order(mergedList);
        return mergedList;
    }

    public static void order(List<Integer> list){
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)>list.get(j)){
                    Integer aux=list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,aux);
                }
            }
        }
    }

    public static void main(String[] args) {

        List<Integer> L1= asList(1,5,6);
        List<Integer> L2= asList(1,2,3,4);
        System.out.println(mergeLists(L1,L2));
    }
}
