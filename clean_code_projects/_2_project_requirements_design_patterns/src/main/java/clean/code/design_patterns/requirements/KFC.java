package clean.code.design_patterns.requirements;

public class KFC extends FastFood {

    @Override
    public void aprovizionareCarne() {
        System.out.println("Se primeste carne de pui: Fillet Bites, Crispy Strips, Hot Wings, Bucati Kentucky");
    }

    @Override
    public void aprovizionareBautura() {
        System.out.println("Se primesc urmatoarele bauturi: Cola, Fanta, Sprite, Lapte, Apa");
    }

    @Override
    public void  aprovizionareLegume() {
        System.out.println("Se primesc urmatoarele legume: varză, morcov, salată verde, sfeclă roșie, roșii cherry, castraveți, boabe de porumb");
    }
    public void aprovizionareJucarii() {
        System.out.println("Se primesc urmatoarele jucarii: Hello Kitty, Bakugan. ");
    }
    @Override

    public void aprovizionareSosuri() {

        System.out.println("Se primesc urmatoarele sosuri: Glenn, Ketchup,Barbeque, Curry Mango. ");
    }

    public void aprovizionareGarnituri() {
        System.out.println("Se primesc urmatoarele garnituri: cartofi prajiti, dipping fries, mini-porumb, felii bacon, felii cheddar ");
    }

    public void aprovizionareDesert() {
        System.out.println("Se primesc urmatoarele deserturi: tarta ciocolata, carrot cake, choco cookie ");
    }

}
