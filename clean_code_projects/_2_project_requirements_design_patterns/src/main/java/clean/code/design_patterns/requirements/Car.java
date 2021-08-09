package clean.code.design_patterns.requirements;

public class Car{
        private String brand;
        private String model;
        private String engine;
        private String type;
        private String fuel;
        private String power;
        private String regnumber;
        private String year;

        public Car(Builder builder){
                this.brand = builder.brand;
                this.model = builder.model;
                this.engine = builder.engine;
                this.type = builder.type;
                this.fuel = builder.fuel;
                this.power = builder.power;
                this.regnumber = builder.regnumber;
                this.year = builder.year;
        }

        public void printb(){
                System.out.println("Masina este marca: " + this.brand);
        }

        public void printm(){
                System.out.println("Masina este model: " + this.model);
        }

        public static class Builder{
                private String brand;
                private String model;
                private String engine;
                private String type;
                private String fuel;
                private String power;
                private String regnumber;
                private String year;

                public Builder(String brand){
                        this.brand = brand;
                }

                public Builder setModel(String model){
                        this.model = model;
                        return this;
                }

                public Builder setEngine(String engine){
                        this.engine = engine;
                        return this;
                }

                public Builder setType(String type){
                        this.type = type;
                        return this;
                }

                public Builder setFuel(String fuel){
                        this.fuel = fuel;
                        return this;
                }


                public Builder setPower(String power){
                        this.power = power;
                        return this;
                }

                public Builder setRegnumber(String regnumber){
                        this.regnumber = regnumber;
                        return this;
                }

                public Builder setYear(String year){
                        this.year = year;
                        return this;
                }

                public Car build() {
                        return new Car(this);
                }
        }










        }
