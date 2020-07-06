package clean.code.design_patterns.requirements._1_BuilderPattern;

public class Pizza {
    private String aluat;
    private String sos;
    private String topping;

    public String getAluat() {
        return aluat;
    }

    public void setAluat(String aluat) {
        this.aluat = aluat;
    }

    public String getSos() {
        return sos;
    }

    public void setSos(String sos) {
        this.sos = sos;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
}
