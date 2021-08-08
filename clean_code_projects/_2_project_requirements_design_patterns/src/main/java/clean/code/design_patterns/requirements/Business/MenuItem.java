package clean.code.design_patterns.requirements.Business;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public abstract class MenuItem implements Serializable {

    protected String title;

    protected Double rating;

    protected Integer calories;

    protected Integer protein;

    protected Integer fat;

    protected Integer sodium;

    protected Integer price;

    public abstract int computePrice();

    public abstract Double computeRating();

    public abstract int computeCalories();

    public abstract int computeProtein();

    public abstract int computeFat();

    public abstract int computeSodium();

    public MenuItem() {
    }

    public MenuItem(String title, Double rating, Integer calories, Integer protein, Integer fat, Integer sodium, Integer price) {
        this.title = title;
        this.rating = rating;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.sodium = sodium;
        this.price = price;
    }

    public String[] fieldsToArray(){
        String[] row = new String[7];
        row[0] = this.getTitle();
        row[1] = this.getRating().toString();
        row[2] = this.getCalories().toString();
        row[3] = this.getProtein().toString();
        row[4] = this.getFat().toString();
        row[5] = this.getSodium().toString();
        row[6] = this.getPrice().toString();

        return row;

    }

    public static Integer getLocationIndex(ArrayList<MenuItem> arrayList, String title){
        int i = 0;
        for (MenuItem menuItem: arrayList) {
            if(menuItem.getTitle().equals(title)){
                return i;
            }
            i++;
        }

        return -1;
    }

    public static MenuItem getItemFromArrayList(ArrayList<MenuItem> arrayList, String title){
        for (MenuItem menuItem: arrayList) {
            if (menuItem.getTitle().equals(title)){
                return menuItem;
            }
        }
        return null;
    }

    public static int getTotalPrice(ArrayList<MenuItem> arrayList){
        int totalVal = 0;
        for (MenuItem menuItem: arrayList) {
            totalVal += menuItem.getPrice();
        }
        return totalVal;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public Integer getProtein() {
        return protein;
    }

    public void setProtein(Integer protein) {
        this.protein = protein;
    }

    public Integer getFat() {
        return fat;
    }

    public void setFat(Integer fat) {
        this.fat = fat;
    }

    public Integer getSodium() {
        return sodium;
    }

    public void setSodium(Integer sodium) {
        this.sodium = sodium;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(title, menuItem.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
