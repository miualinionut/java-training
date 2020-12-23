package code._1_study._1_initialization_order;

public class InitializationOrder {
    public static void main(String[] args) {
        Child c = new Child();
    }
}

class Parent {
    static {
        System.out.println("parent static init block");
    }

    {
        System.out.println("parent regular init block");
    }

    public Parent() {
        System.out.println("parent constructor");
    }
}

class Child extends Parent {
    static {
        System.out.println("child  static init block ");
    }

    {
        System.out.println("child  regular init block");
    }

    public Child() {
        System.out.println("child  constructor");
    }
}
