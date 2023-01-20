package clean.code.design_patterns.requirements;


import java.util.Scanner;

interface Animal{
        void speak();
    }

    class Dog implements Animal{
        @Override
        public void speak(){
            System.out.println("Woof woof");
        }
    }

    class Cat implements Animal{
        @Override
        public void speak(){
            System.out.println("Meow meow");
        }
    }

    class Cow implements Animal{
        @Override
        public void speak(){
            System.out.println("Moo moo");
        }
    }

    class Sheep implements Animal{
        @Override
        public void speak(){
            System.out.println("Beehe beehe");
        }
    }

    class Pig implements Animal{
        @Override
        public void speak(){
            System.out.println("Oink oink");
        }
    }


    class AnimalFactory{

        public static Animal getAnimal(String animalType) {
            if(animalType == null) {
                return null;
            }
            if(animalType.equalsIgnoreCase("DOG")){
                return new Dog();
            }
            else if(animalType.equalsIgnoreCase("CAT")){
                return new Cat();
            }
            else if(animalType.equalsIgnoreCase("Cow")){
                return new Cow();
            }
            else if(animalType.equalsIgnoreCase("Sheep")){
                return new Sheep();
            }
            else if(animalType.equalsIgnoreCase("Pig")){
                return new Pig();
            }
            return null;
        }
    }

    class SelectAnimal{
        public static void main(String[] args) {
            System.out.println("Choose animal: dog, cat, cow, sheep, pig");
            Scanner myInput=new Scanner(System.in);
            String ChosenAnimal=myInput.nextLine();
            Animal animal=AnimalFactory.getAnimal(ChosenAnimal);
            if (animal!=null){
                animal.speak();
            }
            else System.out.println("Wrong animal!");
        }
    }

