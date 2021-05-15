package code._4_student_effort;

public class Challenge2 {
    public static String compute(int i){
        String[] word= new String[4];
        word[0]="Foo";
        word[1]="Bar";
        word[2]="Qix";
        word[3]="*";
        Integer[] num=new Integer[4];
        num[0]=3;
        num[1]=5;
        num[2]=7;
        num[3]=0;
        boolean flag=false;

        String s="";
        for(int j=0;j<3;++j) {
            if(i%num[j]==0){
                s+=word[j];
                flag=true;
            }
        }
        char[] digits = String.valueOf(i).toCharArray();
        for (char digit : digits) {

            if (digit == '3') s += "Foo";
            else if (digit == '5') s += "Bar";
            else if (digit == '7') s += "Qix";
            else if (digit == '0') s += "*";
            else if (flag==false) s += digit;
        }





        return s;
    }
    public static void main(String[] args) {

        for(int i=0;i<=100;++i){
            String x=compute(i);
            System.out.println(x);
        }

    }
}
