package clean.code.design_patterns.requirements;

public class Drink {
    private int water;
    private int sugar;
    private int juice;
    private String components;
    private String name;

    public int getWater() {
        return water;
    }

    public int getSugar() {
        return sugar;
    }

    public int getJuice() {
        return juice;
    }

    public String getComponents() {
        return components;
    }

    public String getName() {
        return name;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setJuice(int juice) {
        this.juice = juice;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return "Our " + name + " is made by love for you.";
    }
}
