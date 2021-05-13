package code._4_student_effort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Pair of 3??!!
public class StudentPairOf3 implements Command{
    private int computePairs(String[] data, int maxLimit) {
        int[] array = new int[maxLimit];
        int pairs = 0;

        return pairs;
    }

    public void exec(int maxLimit) {
        int pairs = -1;
        try {
            String currDir = System.getProperty("user.dir") + "/src/main/java/code/_4_student_effort/StudentPairOf3.txt";
            File myObj = new File(currDir);
            Scanner myReader = new Scanner(myObj);
            String[] data = myReader.nextLine().split(" ");
            pairs = computePairs(data, maxLimit);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
        System.out.println(pairs);
    }
}
