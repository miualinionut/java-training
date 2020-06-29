package clean.code.design_patterns.requirements.Flyweight;

import java.io.ObjectInputStream;

public class Flower {
    private String type;
    private String color;

    public Flower(String type, String color) {
        this.type = type;
        this.color = color;
    }

    @Override
    public boolean equals(Object object) {
        if(this.color.compareTo(((Flower)object).color)==0 && this.type.compareTo(((Flower)object).type) ==0 )
            return true;
        return false;
    }

    public void plant(int x, int y){
        System.out.println("Planted a flower of type " + type+" and color " + color + " at x: "+ x + " and y "+ y);
    }
}
