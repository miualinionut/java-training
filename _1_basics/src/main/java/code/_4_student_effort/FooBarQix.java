package code._4_student_effort;

public class FooBarQix {

    public void containsDigit(StringBuffer result,int number){
        while(number > 0){
            if(number % 10 == 3){
                result.append("Foo");
            }
            if(number % 10 == 5){
                result.append("Bar");
            }
            if(number % 10 == 7){
                result.append("Qix");
            }
            number = number/10;
        }
    }
    String compute(int number){
        StringBuffer result = new StringBuffer();

        if(number % 3 == 0){
            result.append("Foo");
        }
        if(number % 5 == 0){
            result.append("Bar");
        }
        if(number % 7 == 0){
            result.append("Qix");

        }
        containsDigit(result,number);
        return result.toString();
    }
    public static void main(String[] args ){
        FooBarQix nw = new FooBarQix();
        System.out.println(nw.compute(150));

    }

}
