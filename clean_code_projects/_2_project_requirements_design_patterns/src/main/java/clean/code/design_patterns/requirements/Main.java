package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {

        // Builder Design Pattern
        Burger b1 = new Burger.Builder()
                .buns("sesame seed")
                .meat("ground beef")
                .vegetables("tomato")
                .sauce("mayo")
                .cheese("halloumi")
                .build();

        Burger b2 = new Burger.Builder()
                .buns("plain")
                .meat("pork")
                .sauce("mustard")
                .build();

        // Factory Design Pattern
        Car car1 = CarFactory.make(0);
        Car car2 = CarFactory.make(1);
        Car car3 = CarFactory.make(2);

    }
}
