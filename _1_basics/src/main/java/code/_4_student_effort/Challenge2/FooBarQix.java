package code._4_student_effort.Challenge2;

public class FooBarQix {
    public static void main(String[] args)
    {

        for(int x=0;x<=105;x++) {
            if ((x % 3 == 0) || (x % 5 == 0) || (x % 7 == 0)) {
                System.out.println(compute(x));
            } else
                System.out.println(x);
        }
    }


    static String compute(int i)
    {
        String s="Foo";

       if(i%3==0) {
           if (i % 5 == 0) {

               if (i % 7 == 0)
                   return s += "Bar"+"Qix";
               return s += "Bar";


           }
           if(i%7==0)
           {
               return s+="Qix";
           }



            return s;
        }
      else if(i%5==0)
        {
            return "Bar";
        }
      else if(i%7==0)
        {
            return "Qix";
        }
     /*   else if((i%3==0)&&(i%5==0)&&(i%7==0))
        {
            return "Foo" + "Bar" + "Qix";
        }
        */
return s;

    }





}
