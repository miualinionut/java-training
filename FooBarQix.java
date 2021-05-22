public class FooBarQix {

        static void compute(int numar)
    {
        String div_by_3 = "Foo";
        String div_by_5 = "Bar";
        String div_by_7 = "Qix";

    /*    switch(numar)
        {
            case 1: {if(numar == 3 )
                      System.out.print(div_by_3+div_by_3);
                    break;}
            case 2: if(numar == 5)
                    System.out.print((div_by_5+div_by_5));
                    break;
            case 3: if(numar == 7)
                     System.out.print(div_by_7+div_by_7);
                    break;
            case 4: int numar_initial = numar;
                while (numar_initial != 0 )
            {
                int cifra ;
                cifra = numar_initial % 10;
                if(cifra == 5 && numar % 5 ==0)
                {
                    System.out.print((div_by_5+div_by_5));
                    break;
                }
                if(cifra == 7 && numar % 7 ==0)
                {
                    System.out.print((div_by_7+div_by_7));
                    break;
                }
                numar_initial = numar_initial / 10;

            }
            case 5:  {
                int cifra , suma_cifrelor = 0;
                int numar_initial2 = numar;
                while (numar_initial2 != 0 ) {

                    cifra = numar % 10;
                    suma_cifrelor = suma_cifrelor + cifra;

                    if(cifra == 3)
                        System.out.print(div_by_3);
                    numar_initial2 = numar_initial2 / 10;
                }
                if(suma_cifrelor % 3 == 0)
                {
                    System.out.print(div_by_3);
                    break;
                }
            }
            case 6:
            {
                int cifra ;
                int numar_initial3 = numar;
                while (numar_initial3 != 0)
                {
                    cifra = numar_initial3 % 10;
                    if(cifra == 0)
                        System.out.print("*");
                    else
                        System.out.print(cifra);
                    numar_initial3 = numar_initial3 / 10;
                }
            }
        }System.out.print(numar);*/

        int e_divizibil =0;
        int are_zero = 0;
        int numar_initial = numar;
        if(numar < 10)
        {
            if(numar % 3 == 0 )
            {System.out.print(div_by_3);
            e_divizibil =1;
            }
            if(numar == 3)
            {
                System.out.print(div_by_3);
                e_divizibil =1;            }

            if(numar % 5 == 0 && numar % 10 == 5)
            {
                System.out.print(div_by_5+div_by_5);
               e_divizibil =1;
            }
            if(numar % 7 == 0 && numar % 10 == 7)
            {
                System.out.print(div_by_7+div_by_7);
                e_divizibil = 1;
            }
            if(e_divizibil == 0)
            System.out.print(numar);
        }

        if(numar >= 10)
        {
            int n=numar;
            int cif;
            int suma_cifrelor=0;

            while(n!=0)
            {
                cif=n%10;
                suma_cifrelor=suma_cifrelor+cif;
                if(cif == 3)
                { System.out.print(div_by_3);
                  e_divizibil=1;
                }
                if(cif == 5)
                { System.out.print(div_by_5);
                e_divizibil=1;
                }

                if(cif == 7)
                {System.out.print(div_by_7);
                e_divizibil=1;
                }
                 if(cif == 0)
                {//System.out.print("*");
                are_zero = 1;
                e_divizibil = 1;

                }

                n=n/10;
            }



                if(suma_cifrelor % 3 == 0 )
                {
                    System.out.print(div_by_3);
                    e_divizibil = 1 ;
                }

            if(numar % 5 == 0)
            {System.out.print(div_by_5);
            e_divizibil=1;
            }

            if(numar % 7 == 0)
            {System.out.print(div_by_7);
            e_divizibil=1;
            }


            if(are_zero == 1 && e_divizibil == 0 )
            {
                while(numar_initial != 0 )
                {
                    int cifra ;
                    cifra = numar_initial % 10 ;
                    if(cifra == 0 )
                        System.out.print("*");
                    else
                        System.out.print(cifra);
                    numar_initial = numar_initial / 10;

                }
            }
            if(e_divizibil == 0)
                System.out.print(numar);

            if(are_zero == 1 && e_divizibil == 1 )
            {
                System.out.print("*");
            }

        }


    }

    public static void afisare( int numar)
    {
       System.out.print(numar + " => ");
    }


    public static void main (String args[])
    {

        int x1 = 303;
        int x2 = 101;
        int x3 = 105;
        for(int i=1;i<=13;i++)

        {
            afisare(i);
            compute(i);
            System.out.println();
        }

        afisare(x1);
        compute(x1);
        System.out.println();
        afisare(x2);
        compute(x2);
        System.out.println();
        afisare(x3);
        compute(x3);
        System.out.println();
    }
}
