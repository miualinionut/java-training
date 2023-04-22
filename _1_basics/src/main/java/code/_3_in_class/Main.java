package code._3_in_class;

public class Main {

    public static void main(String[] args) {
        int[] ar = new int[]{1, 2, 3};
        int[] v1 = ar;
        int[] v2 = ar;

        ar[0]=10;
        v1[0]=100;
        v2[0]=1000;
            displayVector("arr",ar);
            displayVector("v1",v1);
            displayVector("v2",v2);



    }

        private static void displayVector(String name, int []arr){
            System.out.print(name+"=");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    }
