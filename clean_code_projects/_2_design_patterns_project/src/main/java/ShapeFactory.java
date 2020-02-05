public class ShapeFactory {
    public FormaGeometrica getFormaGeometrica(String tip) {
        switch (tip){
            case "Patrat":
                return new Patrat();
            case "Dreptunghi":
                return new Dreptunghi();
            case "Hexagon":
                return new Hexagon();
            case "Dodecaedru":
                return new Dodecaedru();
            default:
                System.out.println("Nu ati ales o forma geometrica valida");
                return null;
            }
        }
    }
