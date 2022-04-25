package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {

        Vehicle car = new Vehicle.Builder("Maserati")
                .type("car")
                .doors(3)
                .wheels(4)
                .currentDirection(180)
                .currentVelocity(80)
                .build();

        Vehicle bike = new Vehicle.Builder("Cube")
                .type("tricycle")
                .doors(0)
                .wheels(3)
                .currentDirection(90)
                .currentVelocity(15)
                .build();
        System.out.println(bike);
        System.out.println(car);
        bike.stop();
        System.out.println(bike);
    }
}
