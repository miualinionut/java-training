package code._4_student_effort.challenge2;

public class PascalTriangle {


    public static void createTriangle(int rows){
        int num=1;
        for(int i=0;i<rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                if(i==0||k==0)
                    num=1;
                else num=num*(i-k+1)/k;

                System.out.print(" "+num);
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {

        int rows=5;
        createTriangle(rows);
    }
}

