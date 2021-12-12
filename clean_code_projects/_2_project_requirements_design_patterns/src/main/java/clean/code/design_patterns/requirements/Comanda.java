package clean.code.design_patterns.requirements;

public class Comanda {

    private final int ID;
    private final String numeCasier;
    private final String meniu;
    private final int pret ;
    private final boolean pachet;
    private final String data;

    private Comanda(UserBuilder builder) {
        this.ID = builder.ID;
        this.numeCasier = builder.numeCasier;
        this.meniu = builder.meniu;
        this.pret = builder.pret;
        this.pachet = builder.pachet;
        this.data = builder.data;
    }

    //@Override
    public void afisareBon() {

        System.out.println("\n Bon fiscal \n "
                + "ID:"+this.ID+" \n "
                + "Meniu:"+this.meniu + " \n "
                + "Pret:"+this.pret+" \n "
                + "Casier:"+this.numeCasier + " \n "
                + "Data: " + this.data );
        if (this.pachet)
            System.out.println(" La pachet! ");
        else
            System.out.println(" Aici! ");
    }

    public static class UserBuilder
    {
        private final int ID;
        private  String meniu;
        private  int pret ; // required
        private  String numeCasier; // required
        private  boolean pachet; // optional
        private  final String data;


        public UserBuilder(int ID,String data ) {
            this.ID = ID;
            this.data = data;
        }

        public UserBuilder meniu(String meniu) {
            this.meniu = meniu;
            return this;
        }

        public UserBuilder pret(int pret) {
            this.pret = pret;
            return this;
        }
        public UserBuilder numeCasier(String numeCasier) {
            this.numeCasier = numeCasier;
            return this;
        }
        public UserBuilder pachet(boolean pachet) {
            this.pachet = pachet;
            return this;
        }

        public Comanda build() {
            Comanda user =  new Comanda(this);
            return user;
        }
    }
}
