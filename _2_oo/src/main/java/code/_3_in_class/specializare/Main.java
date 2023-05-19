package code._3_in_class.specializare;

public class Main {
    public static void main(String[] args) {

        int[] arr01 =new int[]{3,5,1,7,2,6,4};
        int[] arr02 = new int[]{3,5,1,7,2,6,4};

        AlgoritmSortare algAscendent=new AlgoritmSortare();
        AlgoritmSortareDescendent algDescendent= new AlgoritmSortareDescendent();

        algAscendent.sort(arr01);

        algDescendent.sort(arr02);


        AlgoritmSortare alg =new AlgoritmSortare();


    }
    private static void display(int []arr){
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
    }
    //overloading=polimorfism la compilare/static
    void m(int i){}//signature m_int
    void m(int i, int j){}//signature m_int_int
    void m(float j){} //signature float
}
