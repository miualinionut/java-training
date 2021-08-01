package code._1_builder_design_pattern;

public class Main {

    public static void main(String[] args) {

        Sandwich s1 = new Sandwich.Builder("Chicken Sandwich")
                .setMeat("Chicken")
                .setBread("Integral")
                .setSauce("Ketchup")
                .setCheese("Gouda")
                .build();

        Sandwich s2 = new Sandwich.Builder("Vegetarian Sandwich")
                .setBread("Integral")
                .setSauce("Mayonnaise")
                .setCheese("Gouda")
                .setVegetables("Tomatoes")
                .build();
    }
}
