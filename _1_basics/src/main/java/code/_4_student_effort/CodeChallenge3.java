package code._4_student_effort;


public class CodeChallenge3 {
    public static void main(String[] args) {
        int numberOfPair=0;
        int[] pair = {3, 2,-3 ,-2, 3, 0};

        for(int i=0;i<pair.length;i++){
            for(int j=i+1;j<pair.length;j++){
                if(pair[i]+pair[j]==0 && pair[i]!=0){
                    numberOfPair++;
                    pair[j]=0;
                }
            }
        }
        System.out.println(numberOfPair);

    }
}
