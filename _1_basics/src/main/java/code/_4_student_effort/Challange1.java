package code._4_student_effort;

public class Challange1 {
    public static void main(String[] args) {

        String[] word= new String[4];
        word[0]="Fizz";
        word[1]="Buzz";
        word[2]="Rizz";
        word[3]="Jazz";
        Integer[] num=new Integer[4];
        num[0]=3;
        num[1]=5;
        num[2]=7;
        num[3]=11;

        for(int i=0;i<=100;++i){
            String s="";
            boolean flag=false;
            for(int j=0;j<=3;++j){
                if(i%num[j]==0){
                    s+=word[j];
                    flag=true;
                }
            }

            if(flag==true) {
                System.out.println(" " + s);
            }
            else{
                System.out.println(i);
            }



        }
    }
}
