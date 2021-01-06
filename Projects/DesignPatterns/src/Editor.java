import java.io.*;

public class Editor {
    //Singleton
    public static Editor INSTANCE;
    private DecoratableImage image;

    private Editor() {
    }

    public static Editor getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Editor();
        }
        return INSTANCE;
    }

    public void newImage(int height, int width, char fill) {
        image = new Image(height, width, fill);
    }

    public void add(String type, int pozX, int pozY, int size, char fill) {
        add(GeometricObjectFactory.createGeometricObject(type, pozX, pozY, size, fill));
    }

    public void add(GeometricObject obj) {
        if (obj == null)
            return;
        image = new ImageDecorator(image, obj);
    }

    public void print() {
        char[][] canvas = image.Decorate();
        for (int i = 0; i < image.getHeight(); i ++) {
            for (int j = 0; j < image.getWidth(); j ++) {
                System.out.print(canvas[i][j]);
            }
            System.out.print('\n');
        }
    }

    public void exportToTxt(String filename) {
        BufferedOutputStream outputStream = null;
        try {
            outputStream = new BufferedOutputStream(new FileOutputStream(new File(filename)));
        } catch (FileNotFoundException e) {
            System.out.println("Cannot create file.");
            return;
        }
        char[][] canvas = image.Decorate();
        for (int i = 0; i < image.getHeight(); i ++) {
            for (int j = 0; j < image.getWidth(); j ++) {
                try {
                    outputStream.write(canvas[i][j]);
                } catch (IOException e) {
                    System.out.println("Cannot write to file.");
                    return;
                }
            }
            try {
                outputStream.write('\n');
            } catch (IOException e) {
                System.out.println("Cannot write to file.");
                return;
            }
        }
        try {
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //Simple test example
        Editor editor = Editor.getInstance();
        editor.newImage(20,40, ' ');
        editor.add(GeometricObjectFactory.createGeometricObject("square", 0, 15, 100, '~'));
        editor.add(GeometricObjectFactory.createGeometricObject("circle", 1, 0, 8, '%'));
        editor.add(GeometricObjectFactory.createGeometricObject("triangle", 22, 4, 5, '^'));
        editor.add("triangle", 27, 6, 4, '^');
        editor.add("triangle", 32, 8, 3, '^');
        editor.add("rectangle", 10, 14, 3, '#');
        editor.add("rectangle", 16, 14, 3, '#');
        editor.add("square", 9, 14, 2, '#');
        editor.add("square", 21, 14, 2, '#');
        editor.add("square", 12, 13, 2, '|');
        editor.add("square", 18, 13, 2, '|');
        editor.add("square", 13, 12, 1, '*');
        editor.add("square", 19, 12, 1, '*');
        editor.add("square", 13, 11, 1, '*');
        editor.add("square", 20, 11, 1, '*');
        editor.add("square", 14, 10, 1, '*');
        editor.exportToTxt("sample.txt");
        editor.print();
    }

}
