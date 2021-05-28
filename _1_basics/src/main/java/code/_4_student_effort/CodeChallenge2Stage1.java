package code._4_student_effort;

public class CodeChallenge2Stage1 {
    public static void main(String[] args) {
        System.out.println(compute(51));
        System.out.println(compute2(105));
    }
    public static String compute2(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean find = false;
        int aux = number;
        while (aux > 0) {
            if (aux % 10 == 3) {
                stringBuilder.append("Foo");
                find = true;
            }
            if (aux % 10 == 5) {
                stringBuilder.append("Bar");
                find = true;
            }
            if (aux % 10 == 7) {
                stringBuilder.append("Qix");
                find = true;
            }
            if (aux % 10 == 0) {
                stringBuilder.append("*");
                find=true;
            }
            aux = aux / 10;
        }
        if (number % 3 == 0) {
            stringBuilder.append("Foo");
            find = true;
        }
        if (number % 5 == 0) {
            stringBuilder.append("Bar");
            find = true;
        }
        if (number % 7 == 0) {
            stringBuilder.append("Qix");
            find = true;
        }
        if (!find) {
            return String.valueOf(number);
        }
        return stringBuilder.toString();
    }
    public static String compute(int number){
       StringBuilder stringBuilder=new StringBuilder();
       int aux=number;
       while (aux>0){
           if(aux%10==3){
               stringBuilder.append("Foo");
           }
           if(aux%10==5){
               stringBuilder.append("Bar");
           }
           if(aux%10==7){
               stringBuilder.append("Qix");
           }
           aux=aux/10;
       }
       if(number%3==0){
           return stringBuilder.append("Foo").toString();
       }
       if(number%5==0){
           return stringBuilder.append("Bar").toString();
       }
       if(number%7==0){
           return stringBuilder.append("Qix").toString();
       }
       return String.valueOf(number);
    }
}
