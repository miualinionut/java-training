package clean.code.design_patterns.requirements;

public class BuilderPattern {

    static class Apartament {
        private String zona;
        private boolean balcon;
        private int etaj;
        private int dimensiune;
        private int pret;

        private Apartament(Builder builder) {
            this.zona = builder.zona;
            this.balcon = builder.balcon;
            this.etaj = builder.etaj;
            this.dimensiune = builder.dimensiune;
            this.pret = builder.pret;
        }

        public static class Builder {
            private String zona;
            private boolean balcon;
            private int etaj;
            private int dimensiune;
            private int pret;

            public Builder (String zona) {
                this.zona = zona;
            }

            public Builder balcon (boolean val) {
                balcon = val;
                return this;
            }

            public Builder etaj (int val) {
                etaj = val;
                return this;
            }

            public Builder dimensiune (int val) {
                dimensiune = val;
                return this;
            }

            public Builder pret (int val) {
                pret = val;
                return this;
            }

            public Apartament build() {
                return new Apartament(this);
            }
        }

        @Override
        public String toString() {
            return String.format("Apartament [zona=%s, balcon=%s, etaj=%s, dimensiune=%sm^2 pret=%s$]",
                            zona, balcon, etaj, dimensiune, pret);
        }

    }

    public static void main(String[] args) {
        Apartament ap = new Apartament.Builder("Pipera").balcon(
                true).etaj(3).dimensiune(64).pret(150000).build();
        System.out.println(ap);
    }
}