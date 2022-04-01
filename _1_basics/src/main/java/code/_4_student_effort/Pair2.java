package code._4_student_effort;

public class Pair2 {

    boolean isMarked;
    int value;

    public Pair2(boolean marker, int value)
    {
        isMarked = marker;
        this.value = value;
    }
    public static void main(String[] args) {

        Pair2[] array = { new Pair2(false, 3),
                          new Pair2(false, 2),
                          new Pair2(false, -3),
                          new Pair2(false, -2),
                          new Pair2(false, 3),
                          new Pair2(false, 0),

        };

        int nrOfPairs = 0;
        for(int i = 0; i < (array.length - 1); i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                if(!array[i].isMarked && !array[j].isMarked)
                 if (array[i].value + array[j].value == 0)
                  {
                    array[i].isMarked = true;
                    array[j].isMarked = true;
                    nrOfPairs++;
                    break;
                  }
            }
        }
        System.out.println("There are " + nrOfPairs + " pairs");
    }
}
