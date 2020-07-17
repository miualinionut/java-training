package code._4_student_effort.challenge6;

import java.util.ArrayList;
import java.util.List;

public class MatrixSpiral {

    public static List<List<Integer>> generateMatrix(int dim){

        int number=1;
        List<List<Integer>> matrix=new ArrayList<>();
        for(int i=0;i<dim;i++){
            matrix.add(new ArrayList<>());
            for(int j=0;j<dim;j++){
                matrix.get(i).add(0);
            }
        }



        int i=0,j=0;
        char dir='R';
        while(number<=(dim*dim)){


            if(dir=='R'){
                if(j>=0 && j<dim && matrix.get(i).get(j)==0){
                    matrix.get(i).set(j,number);
                    number++;
                    j++;

                }else {
                    dir='D';
                    j--;
                    i++;
                }
            }
            if(dir=='D'){
                if(i>=0 && i<dim && matrix.get(i).get(j)==0){
                    matrix.get(i).set(j,number);
                    number++;
                    i++;

                }else {
                    dir='L';
                    i--;
                    j--;
                }
            }
            if(dir=='L'){
                if(j>=0 && j<dim && matrix.get(i).get(j)==0){
                    matrix.get(i).set(j,number);
                    number++;
                    j--;

                }else {
                    dir='U';
                    j++;
                    i--;
                }
            }
            if(dir=='U'){
                if(i>=0 && i<dim && matrix.get(i).get(j)==0){
                    matrix.get(i).set(j,number);
                    number++;
                    i--;

                }else {
                    dir='R';
                    i++;
                    j++;
                }
            }



        }



        return matrix;
    }

    public static boolean isInList(List<Integer> list, int num){
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals(num)) return true;
        }
        return false;
    }

    public static void showElements(List<List<Integer>> matrix){
        List<Integer> arr=new ArrayList<>();
        int i=0,j=0;
        int steps=1;
        char dir='R';
        while(steps<=matrix.size()*matrix.size()){

            if(dir=='R'){
                if(j>=0 && j<matrix.size() && !isInList(arr,matrix.get(i).get(j))){
                    arr.add(matrix.get(i).get(j));
                    System.out.println(matrix.get(i).get(j));
                    steps++;
                    j++;

                }else {
                    dir='D';
                    j--;
                    i++;
                }
            }
            if(dir=='D'){
                if(i>=0 && i<matrix.size() && !isInList(arr,matrix.get(i).get(j))){
                    arr.add(matrix.get(i).get(j));
                    System.out.println(matrix.get(i).get(j));
                    steps++;
                    i++;

                }else {
                    dir='L';
                    i--;
                    j--;
                }
            }
            if(dir=='L'){
                if(j>=0 && j<matrix.size() && !isInList(arr,matrix.get(i).get(j))){
                    arr.add(matrix.get(i).get(j));
                    System.out.println(matrix.get(i).get(j));
                    steps++;
                    j--;

                }else {
                    dir='U';
                    j++;
                    i--;
                }
            }
            if(dir=='U'){
                if(i>=0 && i<matrix.size() && !isInList(arr,matrix.get(i).get(j))){
                    arr.add(matrix.get(i).get(j));
                    System.out.println(matrix.get(i).get(j));
                    steps++;
                    i--;

                }else {
                    dir='R';
                    i++;
                    j++;
                }
            }



        }
    }


    public static void showMatrix(List<List<Integer>> matrix){

        for(int i=0;i<matrix.size();i++){
            System.out.println(matrix.get(i));
        }

    }

    public static void main(String[] args) {

        List<List<Integer>> matrix= generateMatrix(4);
        showMatrix(matrix);
        showElements(matrix);

    }
}
