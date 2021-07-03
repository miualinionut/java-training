package com.codeofDiane;
import java.util.ArrayList;
import java.util.List;

public class Product {
    private List<Component> components = new ArrayList<Component>();

    public void addComponent(Component component){
        components.add(component);
    }
    public float getFinalCost(){
        float finalCost  = 0.0f;
        for(Component component : components){
            finalCost += component.price();
        }
        return finalCost;
    }

    public void receipt(){
        for(Component component : components){
            System.out.println("Components: " + component.company());
            System.out.println("Price:" + component.price());
        }
    }
}
