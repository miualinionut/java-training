package clean.code.design_patterns.requirements.Flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Flow;

public class FlowerFactory {
    static ArrayList<Flower> flowersCache = new ArrayList<>();

    public static Flower create (String type, String color){
        Flower newFlower = new Flower(type,color);
        for(Flower flower: flowersCache){
            if(flower.equals(newFlower) )
                return newFlower;
        }
        flowersCache.add(newFlower);
        return newFlower;
    }
}
