package code._3_in_class;

public class PairOfTwo {
    public static void main(String[] args) {
        int[] initArray = {1, 1, 0, -1, -1};

        int max = initArray[0];
        int min = initArray[0];
        for (int i = 0; i < initArray.length; i++) {
            if (initArray[i] > max)
                max = initArray[i];
            if (initArray[i] < min)
                min = initArray[i];
        }

        int[] countPositive = new int[max + 1];
        int[] countNegative = new int[Math.abs(min) + 1];
        int finalCount = 0;

        for (int i = 0; i < initArray.length; i++) {
            if(initArray[i] > 0)
                countPositive[initArray[i]] ++;
            else if (initArray[i] < 0){
                int pos = Math.abs(initArray[i]);
                countNegative[pos] ++;
            }
        }

        for (int i = 0; i < Math.min(countNegative.length, countPositive.length); i++) {
            if ( (countPositive[i] != 0) && (countNegative[i] != 0) ) {
                finalCount = finalCount + Math.min(countPositive[i], countNegative[i]);
            }
        }

        System.out.println(finalCount);

//        print arrays
//        for (int i = 0; i < countNegative.length; i++) {
//            System.out.print(countNegative[i]);
//        }
//        System.out.println("");
//        for (int i = 0; i < countPositive.length; i++) {
//            System.out.print(countPositive[i]);
//        }

    }

}
