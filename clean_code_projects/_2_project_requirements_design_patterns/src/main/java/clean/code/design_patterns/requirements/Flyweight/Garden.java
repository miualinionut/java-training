package clean.code.design_patterns.requirements.Flyweight;

import java.util.ArrayList;

public class Garden {

    private ArrayList<SpecificFlower> flowers = new ArrayList<>();

    public void plantFlower(String type, String color, int x, int y){
        Flower baseFlower= FlowerFactory.create(type,color);
        SpecificFlower flower = new SpecificFlower(baseFlower,x,y);

        flowers.add(flower);
        flower.plant();
    }
}
