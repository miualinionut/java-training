package code._3_in_class.car;

public class Main {
    static class Human {
        Car car;

        public Human(Car car) {
            this.car = car;
        }

        void increaseSpeed() {
            car.increaseSpeed();
        }
    }
    static interface Car {
        void increaseSpeed();
    }

    static class GasCar implements Car {
            Engine engine = new GasEngine();
            public void increaseSpeed() {
                engine.increaseSpeed();
            };
        }

    static class ElectricCar implements Car {
        Engine engine = new ElectricEngine();
        public void increaseSpeed() {
            engine.increaseSpeed();
        }
    }
    static interface Engine {
        void increaseSpeed();
    }

    static class ElectricEngine implements Engine {
        @Override
        public void increaseSpeed() {
            System.out.println("Increase speed implementation from ElectricEngine");
        }
    }
   static class GasEngine implements Engine {
       @Override
       public void increaseSpeed() {
           System.out.println("Increase speed implementation from GasEngine");
       }
   }

    public static void main(String[] args) {
        Human human01 = new Human(new ElectricCar()); // compozitie
        human01.increaseSpeed(); // delegare
        Human human02 = new Human(new GasCar());
        human02.increaseSpeed();
    }
}
