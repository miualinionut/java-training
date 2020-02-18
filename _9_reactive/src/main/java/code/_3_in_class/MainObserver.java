package code._3_in_class;

import javax.swing.*;

public class MainObserver {
    public static void main(String[] args) {
        Netflix netflix = new Netflix();

        Student s01 = new Student("popescu");
        Student s02 = new Student("ionescu");
        Student s03 = new Student("dragomirescu");

        s01.subscriber(netflix);
        s02.subscriber(netflix);
        s03.subscriber(netflix);

        netflix.notifyObservers("a aparaut ghemotron");
        netflix.notifyObservers("a apacut cel mai nou film!");

        netflix.unregister(s03);
        netflix.notifyObservers("episod nou");
    }
}
