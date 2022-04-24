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

    {
        System.out.println("parent regular init block");
    }

    int i = 10;

    public int getI() {
        return i;
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

    int i = 9;

    @Override
    public int getI() {
        return i;
    }

    public Child() {
        super();
        System.out.println("child  constructor");
        System.out.println(this.i);
        System.out.println(super.i);
        System.out.println(this.getI());
        System.out.println(super.getI());
    }
}
