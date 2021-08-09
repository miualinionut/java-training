package clean.code.design_patterns.requirements.builder;

public class Main {
    public static void main(String[] args) {

        Salad salad1 = new Salad.Builder("Caesar Salad").setVegetables("edamame,lettuce").
                setDressing("Caesar").setMeat("Chicken").build();

    }
}
