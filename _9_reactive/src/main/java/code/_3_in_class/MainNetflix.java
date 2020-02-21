package code._3_in_class;

public class MainNetflix {
    public static void main(String[] args) {
        Netflix netflix = new Netflix();

        Student s01 = new Student("popescu");
        Student s02 = new Student("ionescu");
        Student s03 = new Student("dragomirescu");

        s01.subscribe(netflix);
        s02.subscribe(netflix);
        s03.subscribe(netflix);

        netflix.notifyObservers("a aparut un episod nou");

        netflix.unregister(s03);
        netflix.notifyObservers("ep nou");
    }
}
