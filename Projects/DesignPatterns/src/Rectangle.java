public class Rectangle implements GeometricObject {
    private int[] poz;
    private int height, width;
    private char fill;

    public Rectangle() {
    }

    public Rectangle(int pozX, int pozY, int len, char fill) {
        poz = new int[2];
        poz[1] = pozX;
        poz[0] = pozY;
        this.height = len;
        this.width = len * 2;
        this.fill = fill;
    }

    @Override
    public char[][] drawOn(DecoratableImage image) {
        char[][] canvas = image.Decorate();
        if (poz[0] < 0 || poz[1] < 0)
            return canvas;
        for (int i = poz[0]; i < poz[0] + height && i < image.getHeight(); i ++)
            for (int j = poz[1]; j < poz[1] + width && j < image.getWidth(); j ++)
                canvas[i][j] = fill;

        return canvas;
    }
}
