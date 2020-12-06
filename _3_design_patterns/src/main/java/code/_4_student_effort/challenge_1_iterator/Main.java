package code._4_student_effort.challenge_1_iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("CODE CHALLENGE 1");
        int[] arr = new int[] {1, 2, 3, 4, 5, 6};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
