package code._4_student_effort;

public class RizzJazz {
    public static void main(String[] args){
        int i = 0;
        Integer x;
        while (++i < 101) {
            if (i % 7 == 0)
                System.out.print("Rizz");
            if(i % 11 == 0)
                System.out.print("Jazz");
            if(i % 7 != 0 && i % 11 != 0)
                System.out.print(i);
            if(i != 100)
            System.out.print(", ");
        }
    }
}
