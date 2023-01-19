package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {
        //TODO implement your design patterns in this package
        //Exemplu pentru decorator pattern, unde extraCheeseFood si extraMeatAndCheeseFood sunt decoratori care adauga
        // funcționalitate suplimentara (în acest caz, brânza suplimentara si carne suplimentara) obiectului basicFood.
        //De asemenea, este exemplu si pentru State pattern, în care clasa FoodOrder are o interfata OrderState care
        // poate fi setata la diferite stari (Ordered, InProgress, Cancelled) si,
        // în consecinta, se modifica comportamentul metodelor processOrder() și cancelOrder().

        Food basicFood = new BasicFood(5.99, "Pizza");
        Food extraCheeseFood = new ExtraCheese(basicFood);
        Food extraMeatAndCheeseFood = new ExtraMeat(extraCheeseFood);

        System.out.println("Food: " + extraMeatAndCheeseFood.getName());
        System.out.println("Price: $" + extraMeatAndCheeseFood.getPrice());

        FoodOrder foodOrder = new FoodOrder(extraMeatAndCheeseFood);
        foodOrder.processOrder();
        foodOrder.cancelOrder();
    }
}
