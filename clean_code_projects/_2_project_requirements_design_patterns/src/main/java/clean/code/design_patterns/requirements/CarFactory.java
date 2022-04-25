package clean.code.design_patterns.requirements;

public class CarFactory {

    public static Car make(int id) {
        switch (id) {
            case 0:
                return new Suzuki();
            case 1:
                return new Dacia();
            case 2:
                return new Audi();
            default :
                return null;
        }
    }
}
