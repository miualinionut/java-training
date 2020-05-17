package code._4_student_effort.Challenge5;



public class Challenge5Main {
    public static void main(String[] args) {


        Integer[] arr={1,2,3,4,5,6,7,8,9,10};
        Integer[] descarr={10,9,8,7,6,5,4,3,2,1};
        System.out.println( cbin(arr,3,0,arr.length,directionCheck(arr)));
        System.out.println(cbin(arr, 9, 0, descarr.length, directionCheck(descarr)));

    }


    public static <T extends Comparable> int directionCheck(T[] arr) throws ArrayNotSortedException{
        int dir=0;
        boolean asc=false;
        boolean desc=false;
        if(arr[0].compareTo(arr[1])>=0) desc=true;
        else if (arr[0].compareTo(arr[1])<0) asc=true;
        if(desc==true) {
            dir=1;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i].compareTo(arr[i+1])<0) throw new ArrayNotSortedException("NOT SORTED");
            }
        }
        if(asc==true){
            dir=2;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i].compareTo(arr[i+1])>0) throw new ArrayNotSortedException("NOT SORTED");
            }


        }

           return dir;
    }

    public static<T extends Comparable> int cbin(T[] arr,T val, int L,int R,int dir){

        if(L<R) {
            int mid = (L + R) / 2;
            if (arr[mid].compareTo(val) == 0) {
                System.out.println(arr[mid]);
                return mid;
            }
            if (arr[mid].compareTo(val) < 0) {
                if (dir == 1) {
                    return cbin(arr, val, L, mid, dir);
                } else if (dir == 2) {
                    return cbin(arr, val, mid, R, dir);
                }
            }
            if (arr[mid].compareTo(val) > 0) {
                if (dir == 1) {
                    return cbin(arr, val, mid, R, dir);
                } else if (dir == 2) {
                    return cbin(arr, val, L, mid, dir);
                }
            }
        }
        return -1;
    }


}
