public class builderDesignPattern {

    private final String nrStrada;
    private final String strada;
    private final String oras;
    private final String judet;
    private final String codPostal;
    private final String nrTelefon;

    protected builderDesignPattern(Builder builder) {
        this.nrStrada = builder.nrStrada;
        this.strada = builder.strada;
        this.oras = builder.oras;
        this.judet = builder.judet;
        this.codPostal = builder.codPostal;
        this.nrTelefon = builder.nrTelefon;
    }

    @Override
    public String toString() {
        return  "nrStrada='" + nrStrada + '\'' +
                ", strada='" + strada + '\'' +
                ", oras='" + oras + '\'' +
                ", judet='" + judet + '\'' +
                ", codPostal='" + codPostal + '\''+
                ", nrTelefon='" + nrTelefon + '\'';
    }

    public static class Builder {
        private String nrStrada;
        private String strada;
        private String oras;
        private String judet;
        private String codPostal;
        private String nrTelefon;
        public Builder nrStrada(String nrStrada) {
            this.nrStrada = nrStrada;
            return this;
        }

        public Builder strada(String strada) {
            this.strada = strada;
            return this;
        }

        public Builder oras(String oras) {
            this.oras = oras;
            return this;
        }

        public Builder judet(String judet) {
            this.judet = judet;
            return this;
        }

        public Builder codPostal(String codPostal) {
            this.codPostal = codPostal;
            return this;
        }

        public Builder nrTelefon(String nrTelefon) {
            this.nrTelefon = nrTelefon;
            return this;
        }

        public builderDesignPattern build() {
            return new builderDesignPattern(this);
        }
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

}
