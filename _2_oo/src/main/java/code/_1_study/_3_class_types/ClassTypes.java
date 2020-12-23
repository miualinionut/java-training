package code._1_study._3_class_types;

interface SomeRandomInterface {
    class NestedClass {

    }
}

public class ClassTypes {

    void m() {
        int i = 0;
        int j = 1;

        class LocalClass {

        }
    }

    void m2() {
        int k = 0;
        int l = 1;

        Runnable annonimousClass = new Runnable() {
            @Override
            public void run() {
                System.out.println("annonimousClass - run");
            }
        };
        annonimousClass.run();
    }

    static class NestedClass {

    }

    class InnerClass {

    }

    abstract class AbstractClass {
        abstract void doStuff();
    }

    class ConcreteInnerClass extends AbstractClass {

        @Override
        void doStuff() {
            System.out.println("concreteInnerClass - doStuff");
        }
    }

}