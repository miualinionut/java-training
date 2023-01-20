package code._1_study._1_hello_world;

public class HelloWorld {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.hunt();
    }

    public class Fish implements Predator {

        @Override
        public void hunt() {
            System.out.println("Fish is hunting.");
        }
    }
    public interface Predator {
        public void hunt();
    }
}

