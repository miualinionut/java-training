package code._4_student_effort.challenge_2_sorting;

public class BubbleSort implements SortingStrategy{

    void swap(Integer[] list, int i, int j)
    {
        list[i] += list[j];
        list[j] = list[i] - list[j];
        list[i] = list[i] - list[j];
    }

    @Override
    public void sort(Integer[] list) {
        for(int i = 0; i < list.length - 1; i++)
        {
            for(int j = i+1; j < list.length; j++)
            {
                if(list[i] > list[j])
                {
                    swap(list, i, j);
                }
            }
        }
    }
}
