package code._3_in_class;

public class Average<T extends  Number> {
    T[] numbers;

    Average(T[] numbers) {
        this.numbers = numbers;
    }

    double getAverage() {
        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i].doubleValue();
        }
        return sum/ numbers.length;
    }
    boolean sameAverage(Average<T> obj){
        return (getAverage()==obj.getAverage());
    }

    public static void main(String[] args) {
        Integer[] integersNumbers={1,2,3,4};
        Double[] doubleNumbers={1.0, 2.0, 3.0, 4.0};

        Average<Integer> integerObj=new Average<Integer>(integersNumbers);
        Average<Double> doubleObj=new Average<Double>(doubleNumbers);

        System.out.println(integerObj.sameAverage(integerObj));
    }
}