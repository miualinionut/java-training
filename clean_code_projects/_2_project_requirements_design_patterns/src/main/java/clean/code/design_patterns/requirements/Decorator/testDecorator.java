package clean.code.design_patterns.requirements.Decorator;

public class testDecorator {
    public static void main(String[] args) {
        MasinaStock masina1 = new Jante(new Masina());
        masina1.Tuneaza();
        System.out.println("\n--------");

        MasinaStock masina2 = new Spoiler(new Jante( new BaraFata(new Masina ())));
        masina2.Tuneaza();
        System.out.println("\n--------");

        MasinaStock masina3 = new Spoiler(new BaraFata(new Masina ()));
        masina3.Tuneaza();
        System.out.println("\n--------");
    }
}

