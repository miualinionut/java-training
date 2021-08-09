package Business.Models;

public class Materie {
    private Integer idMaterie;
    private String numeMaterie;
    private String numeProfesor;

    public Materie(Integer idMaterie, String numeMaterie, String numeProfesor) {
        this.idMaterie = idMaterie;
        this.numeMaterie = numeMaterie;
        this.numeProfesor = numeProfesor;
    }

    public Integer getIdMaterie() {
        return idMaterie;
    }

    public void setIdMaterie(Integer idMaterie) {
        this.idMaterie = idMaterie;
    }

    public String getNumeMaterie() {
        return numeMaterie;
    }

    public void setNumeMaterie(String numeMaterie) {
        this.numeMaterie = numeMaterie;
    }

    public String getNumeProfesor() {
        return numeProfesor;
    }

    public void setNumeProfesor(String numeProfesor) {
        this.numeProfesor = numeProfesor;
    }

    @Override
    public String toString() {
        return "Materie{" +
                "idMaterie=" + idMaterie +
                ", numeMaterie='" + numeMaterie + '\'' +
                ", numeProfesor='" + numeProfesor + '\'' +
                '}';
    }
}
