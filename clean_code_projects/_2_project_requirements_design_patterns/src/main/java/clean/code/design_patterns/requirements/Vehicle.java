package clean.code.design_patterns.requirements;

public class Vehicle {
    private String name, type;
    private int doors, wheels;
    private int currentVelocity, currentDirection;

    public Vehicle(Builder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.doors = builder.doors;
        this.wheels = builder.wheels;
        this.currentDirection = builder.currentDirection;
        this.currentVelocity = builder.currentVelocity;
    }

    static class Builder {
        private String name;
        private String type;
        private int doors, wheels;
        private int currentVelocity, currentDirection;

        public Builder(String name) {
            this.name = name;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder doors(int doors) {
            this.doors = doors;
            return this;
        }

        public Builder wheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public Builder currentVelocity(int currentVelocity) {
            this.currentVelocity = currentVelocity;
            return this;
        }

        public Builder currentDirection(int currentDirection) {
            this.currentDirection = currentDirection;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }


    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer() : Steering at " + currentDirection + " degrees.");
    }
    public void move(int velocity,int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move() : Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
    public void stop(){
        this.currentVelocity = 0;
    }

    @Override
    public String toString()
    {
        return  "Vehicle: " + this.type + ", Name " + this.name + ", Doors " + this.doors +
                ", Wheels " + this.wheels + ", Speed " + this.currentVelocity + ", Direction "
                + this.currentDirection;
    }
}
