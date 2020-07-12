package clean.code.design_patterns.requirements.proiectpizzerie;

import java.util.List;

public abstract class Pizza {

    private String marimePizza;
    private String numePizza;
    private List<String> ingrediente;
    private int pret;

    public String getNumePizza() {
        return numePizza;
    }

    public List<String> getIngrediente() {
        return ingrediente;
    }

    public String getMarimePizza() {
        return marimePizza;
    }

    public void setIngrediente(List<String> ingrediente) {
        this.ingrediente = ingrediente;
    }

    public void setMarimePizza(String marimePizza) {
        this.marimePizza = marimePizza;
    }

    public void setNumePizza(String numePizza) {
        this.numePizza = numePizza;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public int valoareMultiplicator(){
        String marimePizza = getMarimePizza();
        switch (marimePizza.toLowerCase()){
            case "mica":
                return 1;
            case "medie":
                return 2;
            case "mare":
                return 3;
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return "Pizza aleasa de dvs este " + getNumePizza().toUpperCase() + ", marimea: " + getMarimePizza().toUpperCase() +
                ". Pizza contine ingredientele: " + getIngrediente() + "\n" +
                "Costul total este de " + getPret() +  " lei " + "\n" +
                "Va dorim pofta buna!";
    }
}
