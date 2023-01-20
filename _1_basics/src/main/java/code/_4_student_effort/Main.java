package code._4_student_effort;

import java.util.Arrays;
public class Main {

    public void main(String[] args) {
        Fish fish = new Fish();

    }
    public class Fish implements Predator {
        public void hunt() {
            System.out.println("The fish is hunting.");
        }
    }
    public interface Predator {
        public void hunt();
    }
}
