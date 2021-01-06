public class Square implements GeometricObject{
    private int[] poz;
    private int len;
    private char fill;

    public Square() {
    }

    public Square(int pozX, int pozY, int len, char fill) {
        poz = new int[2];
        poz[1] = pozX;
        poz[0] = pozY;
        this.len = len;
        this.fill = fill;
    }

    @Override
    public char[][] drawOn(DecoratableImage image) {
        char[][] canvas = image.Decorate();
        if (poz[0] < 0 || poz[1] < 0)
            return canvas;
        for (int i = poz[0]; i < poz[0] + len && i < image.getHeight(); i ++)
            for (int j = poz[1]; j < poz[1] + len && j < image.getWidth(); j ++)
                canvas[i][j] = fill;

        return canvas;
    }
}
