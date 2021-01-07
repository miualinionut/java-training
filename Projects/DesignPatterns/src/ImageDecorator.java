public class ImageDecorator implements DecoratableImage{
    //Decorator
    private final DecoratableImage image;
    private final GeometricObject object;

    public ImageDecorator(DecoratableImage image, GeometricObject object) {
        this.image = image;
        this.object = object;
    }

    public DecoratableImage lastImage() {
        return image;
    }

    @Override
    public int getHeight() {
        return image.getHeight();
    }

    @Override
    public int getWidth() {
        return image.getWidth();
    }

    @Override
    public char[][] Decorate() {
        return object.drawOn(image);
    }
}
