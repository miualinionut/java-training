public class Person implements Observer {

    String nume;

    public Person(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void update(String valabilitate) {
        System.out.println("Buna ziua domnule " + nume +" , Produsul este acum " + valabilitate + " pe magazinul lui Bogdan");
    }
}
