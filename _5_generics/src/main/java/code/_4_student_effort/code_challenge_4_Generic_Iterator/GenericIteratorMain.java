package code._4_student_effort.code_challenge_4_Generic_Iterator;

public class GenericIteratorMain {

    public static void main(String[] args) {
        Car[] cars = new Car[10];
        Bike[] bikes = new Bike[10];

        for (int i = 0; i < 10; i++) {
            cars[i] = new Car("Tesla" + i, 60_000);
            bikes[i] = new Bike("Mountain_bike" + i, 12.00);
        }

        IArrayIterator<Car> it1 = new ArrayIterator<>(cars);
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        IArrayIterator<Bike> it2 = new ArrayIterator<>(bikes);
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}
