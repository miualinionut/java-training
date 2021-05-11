package code._2_challenge._2_pairs;

public class Boot implements Shoe {
    private final String color;
    private final double size;

    public Boot(String color, double size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getSize() {
        return size;
    }
}
