package Business.Models;

public class Nota {
    private int idNota;
    private String numeStudent;
    private String numeMaterie;
    private int nota;

    public Nota(int idNota, String numeStudent, String numeMaterie, int nota) {
        this.idNota = idNota;
        this.numeStudent = numeStudent;
        this.numeMaterie = numeMaterie;
        this.nota = nota;
    }

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public String getNumeStudent() {
        return numeStudent;
    }

    public void setNumeStudent(String numeStudent) {
        this.numeStudent = numeStudent;
    }

    public String getNumeMaterie() {
        return numeMaterie;
    }

    public void setNumeMaterie(String numeMaterie) {
        this.numeMaterie = numeMaterie;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "idNota=" + idNota +
                ", numeStudent='" + numeStudent + '\'' +
                ", numeMaterie='" + numeMaterie + '\'' +
                ", nota=" + nota +
                '}';
    }
}
