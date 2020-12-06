package code._4_student_effort.Template_Method;



import java.util.Arrays;

public class Client {
    public static void main(String[] args)
    {

        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        Asc_BubbleSort asc = new Asc_BubbleSort();
        asc.sort(copy01OfArr);
        Desc_BubbleSort desc = new Desc_BubbleSort();
        desc.sort(copy02OfArr);

        printArray(copy01OfArr);
        printArray(copy02OfArr);

    }
   public static void printArray(Integer[] list)
    {
        int n = list.length;
        for (int i=0; i<n; ++i) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

}
