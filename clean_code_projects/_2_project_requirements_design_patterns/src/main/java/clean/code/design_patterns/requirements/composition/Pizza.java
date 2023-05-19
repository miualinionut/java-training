package clean.code.design_patterns.requirements.composition;

//pizza class
public class Pizza {
    private int id; //separate id for every pizza baked
    private int numberOfIngredients; //the number of ingredients which is going to be random for every pizza(3 through 7)

    public int getId() {
        return id;
    }

    public int getNumberOfIngredients() {
        return numberOfIngredients;
    }

    public Pizza(int id, int numberOfIngredients) {
        this.id = id;
        this.numberOfIngredients = numberOfIngredients;
    }

    @Override
    public String toString() {
        return "Pizza number " + id +
                ", having " + numberOfIngredients + " ingredients";
    }
}