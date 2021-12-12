package clean.code.design_patterns.requirements;

public abstract class FastFood {

    public final void buildfastfood() {
        constructieSpatiuMancare();
        asigurareNormeIgienicoSanitare();

        aprovizionareCarne();
        aprovizionareBautura();
        aprovizionareLegume();
        aprovizionareJucarii();
        aprovizionareSosuri();
        aprovizionareGarnituri();
        aprovizionareDesert();
        System.out.println("Se pot onora comenzi!");
    }

    public abstract void aprovizionareCarne();

    public abstract void aprovizionareBautura();

    public abstract void aprovizionareLegume();

    public abstract void aprovizionareJucarii();

    public abstract void aprovizionareSosuri();

    public abstract void aprovizionareGarnituri();

    public abstract void aprovizionareDesert();

    private final void constructieSpatiuMancare() {
        System.out.println("Spatiul pentru a servi a fost construit.");
    }


    private final void asigurareNormeIgienicoSanitare() {
        System.out.println("Fast-food-ul respecta normele igienico-sanitare.");
    }
}
