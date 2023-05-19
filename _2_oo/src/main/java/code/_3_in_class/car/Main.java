package code._3_in_class.car;

public class Main {
    static class Human{
        Car car;
        public Human(Car car){
            this.car=car;
        }
        void increaseSpeed(){
            car.increaseSpeed();
        }

    }
    static interface Car{
        void increaseSpeed();
    }
    //static class ElectricEngine implements Engine{
        //Engine engine =new ElectricEngine();

        //public Engine {
/*
        }
    }*/

    /*static class GasEngine implements Engine{
        public void increaseSpeed()
        {
            System.out.println("increase speed implementation from GasEngine");
        }
    }*/

    /*static class TurboGasEngine implements Engine{
        public void increaseSpeed()
        {
            System.out.println("increase speed implementation from GasEngine");
        }
    }*/


    public static void main(String[] args) {

        //Human human01= new Human(new GenericCar(new ElectricEngine()));
        //Human human01= new Human(new GenericCar(new GasEngine()));
        //Human human01= new Human(new GenericCar(new TurboGasEngine()));
    }
}
