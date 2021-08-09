package code._4_student_effort;

import code._2_challenge._3_anagram.Anagram;

public class challenge3 {
    public static void main(String[] args) {
        String s = "listen";
        Anagram(s,0,s.length()-1);
    }

    private static void Anagram(String s,int start,int end){
        if(start == end){
            System.out.println(s);
        } else {
            for(int i=start;i<=end;i++){
                s = swap(s,start,i);
                Anagram(s,start+1,end);
                s = swap(s,start,i);
            }
        }
    }

    private static String swap(String s, int i, int j){
        char[] charArr = s.toCharArray();
        char aux;

        aux = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = aux;

        return String.valueOf(charArr);
    }
}
