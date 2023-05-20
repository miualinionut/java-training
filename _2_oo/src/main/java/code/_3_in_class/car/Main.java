package code._3_in_class.car;

public class Main {
    static class Human
    {
        Car car;
        public Human(Car car)
        {
            this.car= car;
        }
        void increaseSpeed(){
            car.increaseSpeed();
        }

    }
    static interface Car{
        void increaseSpeed();
    }
    static class GasCar implements Car{
        Engine engine= new GasEngine();
        public void increaseSpeed(){
            engine.increaseSpeed();
        }
    }
    static class ElectricalCar implements Car{
        Engine engine= new ElectricalEngine();
        public void increaseSpeed(){
            engine.increaseSpeed();
        }
    }
    static interface Engine{
        void increaseSpeed();
    }
    static class ElectricalEngine implements Engine{
        public void increaseSpeed()
        {
            System.out.println("increase speed implementation from ElectricalEngine");
        }
    }
    static class GasEngine implements Engine{
        public void increaseSpeed()
        {
            System.out.println("increase speed implementation from GasEngine");
        }
    }
    public static void main(String[] args){
        Human human01 = new Human(new ElectricalCar());
        Human human02 = new Human(new GasCar());
        human01.increaseSpeed();
        human02.increaseSpeed();
    }
}
