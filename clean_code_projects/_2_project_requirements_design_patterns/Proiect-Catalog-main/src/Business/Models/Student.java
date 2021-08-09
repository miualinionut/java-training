package Business.Models;


public class Student {
    private Integer idStudent;
    private String nume;
    private String prenume;
    private int anDeStudiu;

    public Student(Integer idStudent, String nume, String prenume, int anDeStudiu) {
        this.idStudent = idStudent;
        this.nume = nume;
        this.prenume = prenume;
        this.anDeStudiu = anDeStudiu;
    }

    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getAnDeStudiu() {
        return anDeStudiu;
    }

    public void setAnDeStudiu(int anDeStudiu) {
        this.anDeStudiu = anDeStudiu;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", anDeStudiu=" + anDeStudiu +
                '}';
    }
}
