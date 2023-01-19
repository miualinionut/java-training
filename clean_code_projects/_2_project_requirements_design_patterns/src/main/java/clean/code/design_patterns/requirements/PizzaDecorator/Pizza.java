package clean.code.design_patterns.requirements.PizzaDecorator;

    public interface Pizza {

        void addIngredient(Ingredient ingredient);

        int getCost();

        void showIngredients();

        void showPizzaName();

    }
