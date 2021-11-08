import java.util.Scanner;

public class Pair_of_2
{
    static Integer perechi(int array[], int n)
    {
        int i = 0, j, rezultat = 0;
        while(i < n - 1) {
            for (j = i + 1; j < n; j++)
                if (array[i] + array[j] == 0) {
                    rezultat += 1;
                    for(int x = j; x < n - 1; x++)
                        array[x] = array[x + 1];
                    n -= 1;
                    j = n + 1;
                    i = i + 1;
                }
            i = i + 1;
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
        int rezultat = perechi(array, numar);
        System.out.println(rezultat);

    }
}