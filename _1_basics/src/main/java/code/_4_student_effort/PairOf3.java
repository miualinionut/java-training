package code._4_student_effort;

public class PairOf3 {



    private int nextZero(int[] arr,int start){
        for(int i=start;i<arr.length;i++){
            if(arr[i]==0) return i;
        }
        return arr.length-1;
    }

    public Integer nrPairs(Integer[] arr){

        int nr=0;
        int[] pos=new int[arr.length];
        int i=0,j=1,k=2;
        while (i<=arr.length-3 && nr<arr.length/3){

            i=nextZero(pos,i);
            j=nextZero(pos,i+1);
            k=nextZero(pos,j+1);

            for(;j<arr.length-1;j++){
                for(;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        nr++;
                        pos[i]=1;
                        pos[j]=1;
                        pos[k]=1;
                    }
                }
            }


        }
        return nr;
    }
}
