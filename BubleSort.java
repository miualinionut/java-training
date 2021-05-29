public class BubleSort implements SortingStrategy{

    @Override
    public void sort(Integer[] list) {

            int n = list.length;
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if (list[j] > list[j+1])
                    {
                        int aux = list[j];
                        list[j] = list[j+1];
                        list[j+1] = aux;
                    }

            System.out.println("BubleSort");
            for (int i=0; i<n; ++i)
                System.out.print(list[i] + " ");
            System.out.println();
        }
 }
