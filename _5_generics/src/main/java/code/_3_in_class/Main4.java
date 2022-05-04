package code._3_in_class;

import java.util.HashSet;
import java.util.Set;

public class Main4 {
    public static void main(String[] args) {
        Set<? extends Number> setOfAllSubTypeOfNumber = new HashSet<Integer>();
        Set<? extends Number> setOfAllSubTypeOfNudsmber = new HashSet<Float>();
        Set<? extends Number> setOfAlslSubTypeOfNumber = new HashSet<Double>();
        //Set<? extends Number> setOfAllaSubTypeOfNumber = new HashSet<String>();

    }
}
