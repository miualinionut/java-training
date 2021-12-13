package clean.code.design_patterns.requirements;

public class CharacterComponent {
    private final int width;
    private final int height;

    public CharacterComponent(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
