package clean.code.design_patterns.requirements;

interface Animal {
    void speak();
    void color();
    void kilograms();
    Boolean isTame();

}

class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Woof woof");
    }

    @Override public void color()
    {
        System.out.println("Black");
    }
    @Override public void kilograms() {
        System.out.println("20 kilograms");
    }

    @Override
    public Boolean isTame() {
        return false;
    }
}

class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("Meow meow");
    }
    @Override public void color() {
        System.out.println("Orange");
    }

    @Override public void kilograms() {
        System.out.println("4.5 kilograms");
    }

    @Override
    public Boolean isTame() {
        return true;
    }
}

class Rabbit implements Animal {

    @Override
    public void speak() {
        System.out.println("Clicking his teeth");
    }
    @Override public void color() {
        System.out.println("White");
    }

    @Override public void kilograms() {
        System.out.println("1.25 kilograms");
    }

    @Override
    public Boolean isTame() {
        return true;
    }

}

class Snake implements Animal {

    @Override
    public void speak() {
        System.out.println("Shhh");
    }
    @Override public void color() {
        System.out.println("Greenish brown");
    }

    @Override public void kilograms() {
         System.out.println("32.4 kilograms");
    }

    @Override
    public Boolean isTame() {
        return false;
    }

}


class AnimalFactory {
    public static Animal getAnimal(String type) {
        if ("dog".equalsIgnoreCase(type)) {
            return new Dog();
        } else if ("cat".equalsIgnoreCase(type)) {
            return new Cat();
        }
        else if("rabbit".equalsIgnoreCase(type)) {
            return new Rabbit();
        } else if ("snake".equalsIgnoreCase(type)) {
            return new Snake();
        }
        return null;
    }


}


