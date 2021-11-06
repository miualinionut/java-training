package code._4_student_effort;

public class FooBarQix {
    public static String compute(int x){
        String result = "";
        if(x%3 ==0) result +=  "Foo";
        if(x%5 ==0) result +=  "Bar";
        if(x%7 ==0) result +=  "Qix";
        char array[] = String.valueOf(x).toCharArray();
        for(int i = 0; i<array.length; i++){
            if(array[i]=='3') result += "Foo";
            if(array[i]=='5') result += "Bar";
            if(array[i]=='7') result += "Qix";
        }
        if(result == ""){
            result = String.valueOf(x);
        }
        return result;
    }
    public static String compute2(int x){
        String result = "";
        if(x%3 ==0) result +=  "Foo";
        if(x%5 ==0) result +=  "Bar";
        if(x%7 ==0) result +=  "Qix";
        char array[] = String.valueOf(x).toCharArray();
        for(int i = 0; i<array.length; i++){
            if(array[i]=='3') result += "Foo";
            if(array[i]=='5') result += "Bar";
            if(array[i]=='7') result += "Qix";
        }
        if(result == ""){
            for(int i = 0; i<array.length; i++){
                if(array[i]=='0') array[i] = '*';
            }
            result = String.valueOf(array);
        }else{
            for(int i = 0; i<array.length; i++){
                if(array[i]=='0') result += "*";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            System.out.println(i+" => "+compute(i));
        }
        //Stage 2
        System.out.println("101 => " + compute2(101));
        System.out.println("303 => " + compute2(303));
        System.out.println("105 => " + compute2(105));
        System.out.println("10101 => " + compute2(10101));
    }
}
