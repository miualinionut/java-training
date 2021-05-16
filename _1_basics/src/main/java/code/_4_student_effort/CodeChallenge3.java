package code._4_student_effort;

public class CodeChallenge3 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,-2,-4,-3,-2,-1,-2,-2,-2};
        int k = 0;
        for(int i=0;i<arr.length-1;i++) {
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i] + arr[j] ==0){
                    k++;
                    arr[i] = 0;
                    arr[j] = 1;
                }
            }
        }
        System.out.print(k);
    }

    //nu merge
//    package code._4_student_effort;
//
//import java.util.ArrayList;
//
//    public class CodeChallenge3 {
//        public static void main(String[] args) {
//            ArrayList<Integer> lista = new ArrayList<Integer>();
//            int numere[] = {2,4,6,-2,-4,-8,-2,-2};
//            for(int i=0;i<numere.length;i++) {
//                lista.add(numere[i]);
//            }
//
//            int k = 0;
//            for(int i=0;i<lista.size()-1;i++) {
//                for (int j=i+1;j<lista.size();j++) {
//                    if (lista.get(i) + lista.get(j) ==0){
//                        k++;
//                        lista.remove(j);
//                        lista.remove(i);
//                    }
//                }
//            }
//            System.out.print(k);
//        }
//    }

}
