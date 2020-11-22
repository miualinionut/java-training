package code._4_student_effort;
public class FooBarQix {

    public static void main(String[] args) {
        compute2(303);
    }


    public static  String compute(int n) {
        String result = " ";
        if (n % 3 == 0)
            result += "Foo";
        if (n % 5 == 0)
            result += "Bar";
        if (n % 7 == 0)
            result += "Qix";
        String FooBar = String.valueOf(n);

        for (int i = 0; i < FooBar.length();i++)
        { char element = FooBar.charAt(i);
          if(element == '3')
              result += "Foo";
          if(element == '5')
              result += "Bar";
          if(element == '7')
              result += "Qix";
        }
        System.out.println(result);


    return result;}

    public static  String compute2(int n) {
        String result = " ";
        if (n % 3 == 0)
            result += "Foo";
        if (n % 5 == 0)
            result += "Bar";
        if (n % 7 == 0)
            result += "Qix";

        String FooBar = String.valueOf(n);

        for (int i = 0; i < FooBar.length();i++)
        { char element = FooBar.charAt(i);
            if(element == '3')
                result += "Foo";
            if(element == '5')
                result += "Bar";
            if(element == '7')
                result += "Qix";
            if(element == '0')
                result += "*";
           /* else
                result += FooBar.charAt(i);     cu liniile 54 si 55 functioneaza programul pentru valoarea 101 dar nu si pentru celelalte valori din exemplu  */
        }
        System.out.println(result);


        return result;}

}