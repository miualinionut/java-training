package clean.code.design_patterns.requirements.Business;

import clean.code.design_patterns.requirements.Data.Serialiser;

import java.io.Serializable;

public class BaseProduct extends MenuItem implements Serializable {

    public BaseProduct(String title, Double rating, Integer calories, Integer protein, Integer fat, Integer sodium, Integer price) {
        super(title, rating, calories, protein, fat, sodium, price);
    }

    @Override
    public int computePrice() {
        return this.price;
    }

    @Override
    public Double computeRating() {
        return this.rating;
    }

    @Override
    public int computeCalories() {
        return this.calories;
    }

    @Override
    public int computeProtein() {
        return this.protein;
    }

    @Override
    public int computeFat() {
        return this.fat;
    }

    @Override
    public int computeSodium() {
        return this.sodium;
    }
}
