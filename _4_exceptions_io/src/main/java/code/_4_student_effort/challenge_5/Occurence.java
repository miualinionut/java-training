package code._4_student_effort.challenge_5;

import java.util.HashMap;

public class Occurence {
    public static void main(String[] args) {
        Occurence occurence = new Occurence();
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Test", 1);
        hashMap.put("Test", hashMap.get("Test") + 1);
        System.out.println(hashMap.get("Test"));
    }
}
