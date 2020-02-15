package code._3_in_class;


public class Factory {
    public static void main(String[] args) {

    }
    public Car make(String type){
        if(type.equals("duster")) return new Duster();
        if(type.equals("sandero")) return new Sandero();
        throw new IllegalArgumentException("nu cunosc acest tip de masina");
    }
}
interface Car{}
class Duster implements Car{}
class Sandero implements Car{}