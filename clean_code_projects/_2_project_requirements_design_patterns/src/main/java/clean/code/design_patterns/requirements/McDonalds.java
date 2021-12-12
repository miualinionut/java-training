package clean.code.design_patterns.requirements;

public class McDonalds extends FastFood {
    @Override
    public void aprovizionareCarne() {
        System.out.println("Se primeste carne de pui (Nuggets, Aripioare picante), porc, vita, peste ");
    }

    @Override
    public void aprovizionareBautura() {
        System.out.println("Se primesc urmatoarele bauturi: Cola, Fanta, Sprite, Lapte, Apa, Lipton, Suc natural");
    }

    @Override
    public void  aprovizionareLegume() {
        System.out.println("Se primesc urmatoarele legume: salată Eisberg, ceapă roșie, măsline, castraveți, roșii cherry și ardei gras roșu.");
    }

    @Override
    public void aprovizionareJucarii() {

        System.out.println("Se primesc urmatoarele jucarii: Fetitele PowerPuff, Minnions. ");
    }

    public void aprovizionareSosuri() {
        System.out.println("Se primesc urmatoarele sosuri: Sour, Dulce-acrisor, Maioneza, Ceaser. ");
    }

    public void aprovizionareGarnituri() {
        System.out.println("Se primesc urmatoarele garnituri: cartofi prajiti, dipping fries, camembert bites, mcmuffin, lipii ");
    }

    public void aprovizionareDesert() {
        System.out.println("Se primesc urmatoarele deserturi: McFlurry, CheeseCake Bites ");
    }
}