package clean.code.design_patterns.requirements.CombinedDesignPatterns;

public class ItemFactoryDrink {
    public ItemsDrink DrinkType(String item) {
        if ("SmallPepsi".equals(item)) {
            return new ColdDrink.Builder("SmallPepsi", 5, 330 )
                    .build();
        } else if ("SmallCoke".equals(item)) {
            return new ColdDrink.Builder("SmallCoke", 5,330)
                    .build();
        } else if ("LargePepsi".equals(item)) {
            return new ColdDrink.Builder("LargePepsi", 10, 750)
                    .build();
        } else if ("LargeCoke".equals(item)) {
            return new ColdDrink.Builder("LargeCoke", 10, 750)
                    .build();
        }
        return null;
    }
}
