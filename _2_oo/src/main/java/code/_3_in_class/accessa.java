package code._3_in_class;


import java.lang.reflect.Array;
import java.util.*;

public class accessa {
    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<>();
        v.add(8); v.add(8); v.add(8); v.add(8); v.add(8);
        v.add(1); v.add(2); v.add(2);
        v.add(4);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(Integer var : v){
            map.merge(var, 1, Integer::sum);
        }
        String single = new String("Single: ");
        String doubl = new String("Double: ");
        String triple = new String("Triple: ");
        String quadruple = new String("Quadruple: ");
        String quintuple = new String("Quintuple: ");
        for(Map.Entry<Integer, Integer> entry : map.entrySet() ){
            if(entry.getValue() == 1){
                single+=entry.getKey().toString() + " ";
            }
            if(entry.getValue() == 2){
                doubl+=entry.getKey().toString() + " ";
            }
            if(entry.getValue() == 3){
                triple+=entry.getKey().toString() + " ";
            }
            if(entry.getValue() == 4){
                quadruple+=entry.getKey().toString() + " ";
            }
            if(entry.getValue() == 5){
                quintuple+=entry.getKey().toString() + " ";
            }
        }
        ArrayList<String> result = new ArrayList<>();
        if( (single.compareTo("Single: "))!=0){
            result.add(single);
        }
        if( (doubl.compareTo("Double: "))!=0){
            result.add(doubl);
        }
        if( (triple.compareTo("Triple: ")) != 0){
            result.add(triple);
        }
        if( (quadruple.compareTo( "Quadruple: "))!=0){
            result.add(quadruple);
        }
        if( (quintuple.compareTo("Quintuple: ")) != 0){
            result.add(quintuple);
        }
        Collections.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.split(" ").length - o2.split(" ").length;
            }
        });
        System.out.println(result);

    }
}
