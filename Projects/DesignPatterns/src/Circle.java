public class Circle implements GeometricObject{
    private int[] poz;
    private int rad;
    private char fill;

    public Circle() {
    }

    public Circle(int pozX, int pozY, int diameter, char fill) {
        poz = new int[2];
        poz[1] = pozX;
        poz[0] = pozY;
        this.rad = diameter/2;
        this.fill = fill;
    }

    @Override
    public char[][] drawOn(DecoratableImage image) {
        char[][] canvas = image.Decorate();
        if (poz[0] < 0 || poz[1] < 0)
            return canvas;
        for (int i = poz[0]; i < poz[0] + 2 * rad + 1 && i < image.getHeight(); i++)
            for (int j = poz[1]; j < poz[1] + 2 * rad + 1 && j < image.getWidth(); j++)
                if (Math.pow((i - poz[0] - rad), 2) + Math.pow((j - poz[1] - rad), 2) <= rad * rad + 0.5)
                    canvas[i][j] = fill;
        return canvas;
    }
}
