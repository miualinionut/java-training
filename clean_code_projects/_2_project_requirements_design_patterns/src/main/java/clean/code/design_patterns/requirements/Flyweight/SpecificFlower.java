package clean.code.design_patterns.requirements.Flyweight;

public class SpecificFlower {

    private Flower baseFlower;
    int x,y;

    public SpecificFlower(Flower baseFlower, int x, int y) {
        this.baseFlower = baseFlower;
        this.x = x;
        this.y = y;
    }

    public void plant(){
        baseFlower.plant(x,y);
    }
}
