import java.util.Scanner;

public class Pair_of_3
{
    static Integer perechi_de_3(int array[], int n)
    {
        int i = 0, j, k, rezultat = 0;
        while(i < n - 2)
        {
            j = i + 1;
            while(j < n - 1)
            {
                for(k = j + 1; k < n; k++)

                    if(array[i] + array[j] + array[k] == 0)
                    {
                        for(int x = k; x < n - 1; x++)
                            array[x] = array[x + 1];
                        n -= 1;
                        k = n;
                        j = n;
                        i += 2;
                        rezultat += 1;
                    }
                j += 1;
            }
            i += 1;
        }
        return rezultat;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Intodu numarul elementelor: ");
        int numar = scan.nextInt();
        int array[] = new int[100];
        for(int i = 0; i < numar; i++) {
            System.out.println("Dati elementul cu numarul " + String.valueOf(i + 1));
            array[i] = scan.nextInt();
        }
        scan.close();
        int rezultat = perechi_de_3(array, numar);
        System.out.println(rezultat);
    }
}