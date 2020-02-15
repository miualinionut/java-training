package code._4_student_effort;

public class FooBarQix {
    public static void main(String[] args) {

//        System.out.println(compute(21));
//        System.out.println(compute(33));
//        System.out.println(compute(51));
//        System.out.println(compute(53));
        System.out.println(compute(5));
        System.out.println(compute(6));
        System.out.println(compute(4));

    }
    public static String compute(int x){
        String a=""; int ok5 = 0, ok7 = 0;
        if(x % 3 == 0){
            a+="Foo";
        } else if( x % 5 == 0){
            a+="Bar"; ok5 = 1;
        } else if( x % 7 == 0){
            a+="Qix"; ok7 = 1;
        }

        if( x % 5 == 0 && ok5 ==0){
            a+="Bar";
        } else if( x % 7 == 0 && ok7 == 0){
            a+="Qix"; ok7 = 1;
        }

        if( x % 7 == 0 && ok7 == 0){
            a+="Qix";
        }

        int copiex = 0;
        while(x >0){
            copiex += x %10;
            copiex *=10;
            x/=10;
        }

        while(copiex > 0){

            if (copiex % 10 == 3) {
                a+="Foo";
            } else if( copiex % 10 == 5) {
                a+="Bar";
            } else if( copiex % 10 == 7) {
                a+="Qix";
            }
            copiex/=10;
        }
        return a;
    }
}
