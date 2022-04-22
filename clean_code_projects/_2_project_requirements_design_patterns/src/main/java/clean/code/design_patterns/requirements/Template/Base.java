package clean.code.design_patterns.requirements.Template;

import java.util.*;

public abstract class Base {
    abstract void initialize();

    abstract void absoluteValue();

    abstract void substraction();

    abstract void add();

    public final void calculate() {

        System.out.println("Let's begin the test!");
        initialize();
        System.out.println("-----Absolute value------");
        absoluteValue();
        System.out.println("------Substraction-------");
        substraction();
        System.out.println("-------Addition----------");
        add();


    }
}
