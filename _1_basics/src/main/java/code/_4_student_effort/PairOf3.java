package code._4_student_effort;

import java.util.Scanner;

public class PairOf3 {
    public static void remove_element_at_index(int index, int array[]){
        int k;
        for(k=index;k<array.length-1;k++){
            array[k]=array[k+1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int numbers[] = new int[length];
        if(length < 3){
            System.out.println("No pairs");
        }
        else {
            int i, j,k,ok, numberofpairs = 0;
            for (i = 0; i < length; i++) {
                numbers[i] = sc.nextInt();

            for (i = 0; i < length - 2; i++){
                ok=0;
                for (j = i + 1; j < length-1; j++){
                    for(k= i + 2; k< length; k++){
                        if(numbers[i]+numbers[j]+numbers[k]==0){
                            numberofpairs++;
                            ok=1;
                        }
                        if(ok==1){
                            remove_element_at_index(k,numbers);
                            length--;
                            break;
                        }
                    }
                    if(ok==1){
                        remove_element_at_index(j,numbers);
                        length--;
                        break;
                    }
                }
                if(ok==1){
                    remove_element_at_index(i,numbers);
                    length--;
                    break;
                }

        }

        }
            System.out.println(numberofpairs);
    }
}
}

