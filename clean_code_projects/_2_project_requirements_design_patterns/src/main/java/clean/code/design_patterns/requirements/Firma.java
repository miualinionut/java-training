package clean.code.design_patterns.requirements;

public class Firma {
    public static Worker getWorker(String Type) {
        if ("Developer".equals(Type)) {
            return new Developer();
        } else if ("Tester".equals(Type)) {
            return new Tester();
        }

        return null;
    }
}