public class FizzBuzz {
    public static void main ( String args[])
    {
        for ( int i = 1 ; i<=100 ; i++ )
        {

                int n = i ;
                int cifra;
                int suma_cifrelor=0;
                while(n!=0)
                {
                    cifra=n%10;
                    suma_cifrelor=suma_cifrelor+cifra;
                    n=n/10;
                }
                if (suma_cifrelor % 3 == 0)
                { System.out.print("Fizz,");}

            else
            if(i%5 == 0)
            {System.out.print("Buzz,");}
            else
            if(i%7 == 0)
            {System.out.print("Rizz,");}
           else
            if(i%11 == 0)
            {System.out.print("Jazz,");}
            else
                 System.out.print(i+",");


        }
    }

}
