import java.util.Scanner;

public class code2
{
    static String compute(int x)
    {
        String rezultat_1 = "";
        String rezultat_2 = "";
        String rezultat_final;
        int x2 = x;
        boolean ok = false;

        if (x % 3 == 0)
            rezultat_1 += "Foo";
        if (x % 5 == 0)
            rezultat_1 += "Bar";
        if (x % 7 == 0)
            rezultat_1 += "Qix";

        while(x2 > 0)
        {
            if(x2 % 10 == 3)
                rezultat_2 = "Foo" + rezultat_2;
            if(x2 % 10 == 5)
                rezultat_2 = "Bar" + rezultat_2;
            if(x2 % 10 == 7)
                rezultat_2 = "Qix" + rezultat_2;
            if(x2 % 10 == 0)
            {
                rezultat_2 = "*" + rezultat_2;
                ok = true;
            }
             x2 = x2 / 10;
        }

        if(rezultat_1.equals("") && (rezultat_2.equals("") || ok == true))
            rezultat_final = "ok";
        else
            rezultat_final = rezultat_1 + rezultat_2;
        return rezultat_final;
    }

    static String compute_2(int x)
    {
        int x2 = 0;
        String rezultat = "";
        if(compute(x) == "ok")
        {
            while(x > 0)
            {
                if(x % 10 == 0)
                    rezultat = "*" + rezultat;
                else
                    rezultat = String.valueOf(x % 10) + rezultat;
                x = x / 10;
            }
        }
        else
            rezultat = compute(x);
        return rezultat;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Intodu un numar: ");
        int numar = scan.nextInt();
        scan.close();
        String rezultat_final = compute_2(numar);
        System.out.println(rezultat_final);
    }
}