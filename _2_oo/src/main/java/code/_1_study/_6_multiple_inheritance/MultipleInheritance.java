package code._1_study._6_multiple_inheritance;

interface I1 {
    default void m() {
        System.out.println("m from I1");
    }

    default void m1() {
        System.out.println("m1");
    }
}

interface I2 {
    default void m() {
        System.out.println("m from I2");
    }

    default void m2() {
        System.out.println("m2");
    }
}

public class MultipleInheritance implements I1, I2 {
    public static void main(String[] args) {
        MultipleInheritance multipleInheritance = new MultipleInheritance();
        multipleInheritance.m1();
        multipleInheritance.m2();
        multipleInheritance.m();
    }

    @Override
    public void m() {
        //choose between a super implementation or provide your own
        I1.super.m();
        I2.super.m();
    }
}
