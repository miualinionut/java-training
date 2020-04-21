package code._4_student_effort;
import static java.lang.Math.*;

public class FooBarQix {

    public static String compute(int i)
    {
        int length = (int) (Math.log10(i));
        int numar=i;
        int x=10;
        for(int j=1;j<length;j++)
            x*=10;


        String mesaj="";
        if(i%3==0||i%7==0||i%5==0)
        {
            if(i%3==0)
            {
               mesaj=mesaj.concat("Foo");
            }
            if(i%5==0)
            {
                mesaj=mesaj.concat("Bar");
            }
            if(i%7==0)
            {
                mesaj=mesaj.concat("Qix");
            }
        }
        for(int j=0;j<=length;j++)
        {
            if(numar/x==3)
            {
                mesaj = mesaj.concat("Foo");
            }
            else if(numar/x==5)
            {
                mesaj = mesaj.concat("Bar");
            }
            else if(numar/x==7)
            {
                mesaj = mesaj.concat("Qix");
            }

           //else if (String.valueOf(numar).contains("0"))
               // mesaj = mesaj.concat("*");
            numar%=x;
            x/=10;
        }
        if(mesaj.length()==0)
        {

            return mesaj = mesaj.concat(String.valueOf(i));
        }
       else
           return mesaj;
    }

    public static String compute2(int i)
    {
        int length = (int) (Math.log10(i));
        String mesaj="";
        for(int j=0;j<=length;j++)
        {
            if (Integer.toString(i).charAt(j) == '0')
                mesaj = mesaj.concat("*");
        }
        return mesaj;
    }


    public static void main(String[] args) {
        System.out.println(compute2(3030));

    }
}
