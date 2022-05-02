package main.java.clean.code.design_patterns.requirements.Decorator;

public class CoffeeShop {

    public static void main(String[] args) {

        Cappuccino cappuccino = new Cappuccino();
        System.out.println(cappuccino.getDescription() + ": Pret: " + cappuccino.cost()+ "Ron");

        Milk milkAdd = new Milk(cappuccino);
        System.out.println(milkAdd.getDescription() + ": Pret:" + milkAdd.cost()+ "Ron");

        Sugar sugarAdd = new Sugar(cappuccino);
        System.out.println(sugarAdd.getDescription() + ": Pret:" + sugarAdd.cost()+ "Ron");

        Sugar sugarAddOn = new Sugar(milkAdd);
        System.out.println(sugarAddOn.getDescription() + ": Pret:" + sugarAddOn.cost()+ "Ron");

    }
}
