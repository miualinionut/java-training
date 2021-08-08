package clean.code.design_patterns.requirements.Business;

import java.io.Serializable;
import java.util.ArrayList;

public class CompositeProduct extends MenuItem implements Serializable {
    private ArrayList<MenuItem> product;

    public CompositeProduct(String title, ArrayList<MenuItem> product) {
        this.title = title;
        this.product = product;
        this.calories = computeCalories();
        this.fat = computeFat();
        this.price = computePrice();
        this.protein = computeProtein();
        this.sodium = computeSodium();
        this.rating = computeRating();

    }

    @Override
    public int computePrice() {
        Integer totalPrice = 0;
        for (MenuItem product: product) {
            totalPrice += product.price;
        }
        return totalPrice;
    }

    @Override
    public Double computeRating() {
        Double auxRating = 0.0;
        int nrOfProducts = 0;
        for(MenuItem product : product){
            nrOfProducts++;
            auxRating += product.rating;
        }
        return  auxRating/nrOfProducts;
    }

    @Override
    public int computeCalories() {
        Integer totalCalories = 0;
        for (MenuItem product: product) {
            totalCalories += product.calories;
        }
        return totalCalories;
    }

    @Override
    public int computeProtein() {
        Integer totalProtein = 0;
        for (MenuItem product: product) {
            totalProtein += product.protein;
        }
        return totalProtein;
    }

    @Override
    public int computeFat() {
        Integer totalFat = 0;
        for (MenuItem product: product) {
            totalFat += product.fat;
        }
        return totalFat;
    }

    @Override
    public int computeSodium() {
        Integer totalSodium = 0;
        for (MenuItem product: product) {
            totalSodium += product.sodium;
        }
        return totalSodium;
    }
}
