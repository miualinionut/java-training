package code._4_student_effort;

public class CodeChallenge4 {
    public static void main(String[] args) {
        int numberOfPair=0;
        int[] pair = {-1, -1,-1 ,2};

        for(int i=0;i<pair.length;i++){
            for(int j=i+1;j<pair.length;j++){
                for(int k=j+1;k<pair.length;k++){
                if(pair[i]+pair[j]+pair[k]==0&&pair[k]!=0 && pair[i]!=0){
                    numberOfPair++;
                    pair[j]=0;
                    pair[k]=0;
                }
            }
        }}
        System.out.println(numberOfPair);

    }
}
