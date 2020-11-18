package code._4_student_effort.Challange4;

public class Challange4 {

    public static void main(String[] args) {
        int nrOfPairs = 0;
        int vec[] = {-1,-1,-1,2,-6,7,-2};
        int isInPair[] = new int[vec.length];
        for(int i = 0; i < vec.length; i++)
            isInPair[i] = 0;
        for(int i = 0; i < vec.length - 2; i++)
        {
            for(int j = i + 1; j < vec.length - 1; j++)
            {
                for(int k = j + 1; k < vec.length; k++)
                {
                    if(vec[i] + vec[j] + vec[k] == 0 && isInPair[i] == 0 && isInPair[j] == 0 && isInPair[k] == 0)
                    {
                        nrOfPairs++;
                        isInPair[i] = 1;
                        isInPair[j] = 1;
                        isInPair[k] = 1;
                    }
                }

            }
        }
        System.out.println(nrOfPairs);
    }
}

