package code._4_student_effort;

public class PairOf2 {
   public static int checkPairs(int[] numbers){
    int count = 0;
    for (int i =0; i< numbers.length; i++){
        for (int j=i; j< numbers.length; j++){
            if ((numbers[i] != numbers[j]) && (numbers[i] + numbers[j] == 0)) {
            count++;
            numbers[j] = 0;
            break;}
            }
        }
    return count;
    }
   }
