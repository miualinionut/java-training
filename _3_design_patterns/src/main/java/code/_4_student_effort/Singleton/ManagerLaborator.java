package code._4_student_effort.Singleton;

public class ManagerLaborator {
    private String numeManager;
    private double procentBonus;
    private GestiuneAnalize gestionar;

    private static ManagerLaborator instantaManager = null;

    private ManagerLaborator(String numeManager, double procentBonus, GestiuneAnalize gestionar) {
        super();
        this.numeManager = numeManager;
        this.procentBonus = procentBonus;
        this.gestionar = gestionar;
    }

    public String getNumeManager() {
        return numeManager;
    }

    public void setNumeManager(String numeManager) {
        this.numeManager = numeManager;
    }

    public double getProcentBonus() {
        return procentBonus;
    }

    public void setProcentBonus(double procentBonus) {
        this.procentBonus = procentBonus;
    }


    public GestiuneAnalize getGestionar() {
        return gestionar;
    }

    public void setGestionar(GestiuneAnalize gestionar) {
        this.gestionar = gestionar;
    }

    public static synchronized ManagerLaborator getInstanta(String nume, double bonus, GestiuneAnalize gestionar) {
        if (instantaManager == null) {
            instantaManager = new ManagerLaborator(nume, bonus, gestionar);
        }
        return instantaManager;
    }

}
