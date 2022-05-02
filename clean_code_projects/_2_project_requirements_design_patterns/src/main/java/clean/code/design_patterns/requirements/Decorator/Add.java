package main.java.clean.code.design_patterns.requirements.Decorator;

public abstract class Add extends Coffee{

    protected Coffee coffee;

    public Add(String description, Coffee cof) {
        super(description);
        this.coffee = cof;
    }

    public abstract String getDescription();

}
