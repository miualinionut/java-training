package clean.code.design_patterns.requirements;

/* Factory pattern */
public class DrinkFactory {
    public static Drink getDrinkType(String type) {
        if ("Espresso".equals(type)) {
            return new Coffee.Builder("Espresso", "small", "Robusta", 9.2)
                    .setSugar(2)
                    .build();
        } else if ("Cappuccino".equals(type)) {
            return new Coffee.Builder("Cappuccino", "medium", "Arabica", 11.9)
                    .setSugar(3)
                    .setFoamedMilk(true)
                    .setCream(true)
                    .setTopping("Caramel")
                    .build();
        } else if ("Irish".equals(type)) {
            return new Coffee.Builder("Irish", "medium", "Arabica", 15.9)
                    .setCream(true)
                    .setWhiskey(true)
                    .setSugar(3)
                    .build();
        } else if ("Iced_Latte".equals(type)) {
            return new Coffee.Builder("Iced_Latte", "large", "Araica", 14.0)
                    .setFoamedMilk(true)
                    .setTopping("Coconut")
                    .setIce(true)
                    .build();
        } else if ("Black_Tea".equals(type)) {
            return new Tea.Builder("Black_Tea", "large", "black", 12.9)
                    .setMilk(true)
                    .build();
        } else if ("Bubble_Tea".equals(type)) {
            return new Tea.Builder("Bubble_Tea", "extra large", "green", 14.9)
                    .setFruityFlavour("strawberry")
                    .setJellyTopping("TapiocaPearls")
                    .build();
        } else if ("Lemon_Tea".equals(type)) {
            return new Tea.Builder("Lemon_Tea", "large", "lemon", 11.9)
                    .setGinger(true)
                    .setHoney(true)
                    .setLemon(true)
                    .build();
        } else if ("Green_Smoothie".equals(type)) {
            return new Smoothie.Builder("Green_Smoothie", "large", "almond", 12.9)
                    .setBabySpinach(true)
                    .setBanana(true)
                    .setPineapple(true)
                    .setOrange(true)
                    .build();
        } else if ("Strawberry_Smoothie".equals(type)) {
            return new Smoothie.Builder("Strawberry_Smoothie", "large", "coconut", 12.9)
                    .setBanana(true)
                    .setStrawberries(true)
                    .build();
        }

        return null;
    }
}
