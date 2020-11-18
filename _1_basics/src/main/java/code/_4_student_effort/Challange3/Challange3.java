package code._4_student_effort.Challange3;

public class Challange3 {

    public static void main(String[] args) {
        int nrOfPairs = 0;
        int vec[] = {3,2,-3,-2,5,6,3,3,-6};
        int isInPair[] = new int[vec.length];
        for(int i = 0; i < vec.length; i++)
            isInPair[i] = 0;
        for(int i = 0; i < vec.length - 1; i++)
        {
            for(int j = i + 1; j < vec.length; j++)
            {
                if(vec[i] == -vec[j] && isInPair[i] == 0 && isInPair[j] == 0)
                {
                    nrOfPairs++;
                    isInPair[i] = 1;
                    isInPair[j] = 1;
                }
            }
        }
        System.out.println(nrOfPairs);
    }
}
