package clean.code.design_patterns.requirements;

public class TemplateMethodPattern {

        public static void sort(Autobuz[] arr, ISortOrder order) {
            for(int i = 0; i< arr.length-1; i++){
                for(int j = 0; j<arr.length-i-1;j++){
                    if(order.isAscending(arr[j],arr[j+1])){
                        Autobuz k = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = k;
                    }
                }
            }
        }

}
