package clean.code.design_patterns.requirements;

//Singleton pattern - Eager initialization:

class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //private constructor:
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}


//Factory pattern:

interface Smartphone {

    String getName();
    String getYearOfManufacture();
}

class Apple implements Smartphone {

    @Override
    public String getName() {
        return "IphoneX";
    }
    @Override
    public String getYearOfManufacture() {
        return "2018";
    }
}

class Samsung implements Smartphone{

    @Override
    public String getName() {
        return "Samsung S9";
    }
    @Override
    public String getYearOfManufacture() {
        return "2017";
    }
}

class SmartphoneFactory {

    public static Smartphone getSmartphone (String type) {
        if ("Iphone".equals(type)) {
            return new Apple();
        }
        else if ("Samsung".equals(type)){
            return new Samsung();
        }
        return null;
    }
}

public class Main {

    public static void main(String[] args) {
        //TODO implement your design patterns in this package

        System.out.println("Example of execution for Factory pattern:");
        Apple apple = new Apple();
        System.out.println(apple.getName() + " " + apple.getYearOfManufacture());
        Samsung samsung = new Samsung();
        System.out.println(samsung.getName() + " " + samsung.getYearOfManufacture());

    }
}
