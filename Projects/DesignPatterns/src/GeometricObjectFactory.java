public class GeometricObjectFactory {
    //Factory
    static GeometricObject createGeometricObject(String type, int pozX, int pozY, int size, char fill) {
        if (type.toLowerCase().equals("circle")) {
            return new Circle(pozX, pozY, size, fill);
        }
        else if (type.toLowerCase().equals("square")) {
            return new Square(pozX, pozY, size, fill);
        }
        else if (type.toLowerCase().equals("triangle")) {
            return new Triangle(pozX, pozY, size, fill);
        }
        else if (type.toLowerCase().equals("rectangle")) {
            return new Rectangle(pozX, pozY, size, fill);
        }
        else {
            return null;
        }
    }
}
