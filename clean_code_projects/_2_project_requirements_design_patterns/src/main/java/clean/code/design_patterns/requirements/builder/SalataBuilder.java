        public static class SalataBuilder {
        private String salata;
        private String sos;
        private boolean branza;
        private boolean crutoane;


        public SalataBuilder salata(String salata) {
            this.salata = salata;
            return this;
        }

        public SalataBuilder sos(String sos) {
            this.sos = sos;
            return this;
        }

        public SalataBuilder branza(boolean branza) {
            this.branza = branza;
            return this;
        }

        public SalataBuilder crutoane(boolean crutoane) {
            this.crutoane = crutoane;
            return this;
        }

        // Metoda build() care returnează un obiect de tip Salata pe baza valorilor specificate în obiectul SalataBuilder
        public Salata build() {
            return new Salata(this);
        }
    }
}