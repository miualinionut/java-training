package clean.code.design_patterns.requirements;

public class FactoryPattern {
    public static class ColetFactory {
        public static Colet getColet(String produs, String statusLivrare) {
            if (statusLivrare.equalsIgnoreCase("D")) {
                return new Expediat(produs);
            } else if (statusLivrare.equalsIgnoreCase("N")) {
                return new Neexpediat(produs);
            }
            return null;
        }
    }

    static abstract class Colet {
        private String produs;
        abstract String getMessage();
        Colet(String produs) {
            this.produs = produs;
        }
        String getProdusAndMessage() {
            return getMessage() + " " + produs;
        }
    }

    static class Expediat extends Colet {
        public Expediat(String produs) {
            super(produs);
        }

        @Override
        String getMessage() {
            return "Colet expediat:";
        }

    }

    static class Neexpediat extends Colet {
        public Neexpediat(String produs) {
            super(produs);
        }

        @Override
        String getMessage() {
            return "Colet neexpediat:";
        }

    }

    public static void main(String[] args) {
        Colet expediat = ColetFactory.getColet("bormasina", "D");
        System.out.println(expediat.getProdusAndMessage());
        Colet neexpediat = ColetFactory.getColet("scaun de birou", "N");
        System.out.println(neexpediat.getProdusAndMessage());
    }
}
