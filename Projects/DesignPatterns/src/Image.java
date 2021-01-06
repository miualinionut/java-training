public class Image implements DecoratableImage {
    private char[][] canvas;
    private int height;
    private int width;

    public Image() {
    }

    public Image(int height, int width, char fill) {
        this.height = height;
        this.width = width;
        canvas = new char[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                canvas[i][j] = fill;
            }
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public char[][] Decorate() {
        return canvas;
    }
}
