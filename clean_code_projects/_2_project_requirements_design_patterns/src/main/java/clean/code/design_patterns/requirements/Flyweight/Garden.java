package clean.code.design_patterns.requirements.Flyweight;

import java.util.ArrayList;

public class Garden {

    private ArrayList<SpecificFlower> flowers = new ArrayList<>();

    public void plantFlower(String type, String color, int x, int y){

        SpecificFlower flower = new SpecificFlower(FlowerFactory.create(type,color),x,y);
        flowers.add(flower);
        flower.plant();
    }

    public void plantFlower(Flower baseFlower, int x, int y){
        SpecificFlower flower = new SpecificFlower(baseFlower, x, y);
        flowers.add(flower);
        flower.plant();
    }
}
