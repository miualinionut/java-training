public interface DecoratableImage {
    //Decorator
    int getHeight();
    int getWidth();
    DecoratableImage lastImage();
    char[][] Decorate();
}
