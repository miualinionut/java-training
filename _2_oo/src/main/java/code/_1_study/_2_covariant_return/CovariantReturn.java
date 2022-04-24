package code._1_study._2_covariant_return;

public class CovariantReturn {

    public Number getNumber() {
        Integer i = 1;
        Long l = 1L;
        Double d = 1.0d;

        // problema: fa in asa fel a.i. sa constrangi pe cinava sa poata sa faca maxim 1 instanta a unei clase
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();

        return i; //valid
        //return l; //valid
        //return d; //valid
        //return o; //invalid
    }


}
