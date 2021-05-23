package code._4_student_effort;

public class MyFooBarQix {
    public static String compute(int number) {
        String message = "";
        if (number % 3 == 0)
            message += "Foo";
        if (number % 5 == 0)
            message += "Bar";
        if (number % 5 == 0)
            message += "Qix";
        String nrToString = String.valueOf(number);
        for(char i=0;i<nrToString.length();i++){
            if(nrToString.charAt(i) =='3')
                    message+="Foo";
            if(nrToString.charAt(i) =='5')
                message+="Bar";
            if(nrToString.charAt(i) =='7')
                message+="Qix";
        }
        return message;
    }

    public static String compute2(int number) {
        String message = "";
        if (number % 3 == 0)
            message += "Foo";
        if (number % 5 == 0)
            message += "Bar";
        if (number % 5 == 0)
            message += "Qix";
        String nrToString = String.valueOf(number);
        for(char i=0;i<nrToString.length();i++){
            if(nrToString.charAt(i) =='0')
                message+="*";
            if(nrToString.charAt(i) =='3')
                message+="Foo";
            if(nrToString.charAt(i) =='5')
                message+="Bar";
            if(nrToString.charAt(i) =='7')
                message+="Qix";


        }
        return message;
    }

    public static void main(String[] args) {
        String message;
        for (int i = 1; i <= 53; i++) {
            message = compute(i);

            if (message.isEmpty())
                System.out.println(i + "=>" + i);
            else
                System.out.println(i + "=>" + message);
        }


        for (int i = 1; i <= 10101; i++) {
            message = compute2(i);

            if (message.isEmpty())
                System.out.println(i + "=>" + i);
            else
                System.out.println(i + "=>" + message);
        }
    }


}
