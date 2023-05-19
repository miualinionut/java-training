package code._3_in_class;

public class Student {

    public static final Student INSTANCE=new Student();
    private String nume="Popescu";
    private Integer notaMatematica=10;
    private Integer notaInformatica=10;
    private Integer notaEngleza=10;

    private Student(){};

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNotaMatematica(Integer notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public void setNotaInformatica(Integer notaInformatica) {
        this.notaInformatica = notaInformatica;
    }

    public void setNotaEngleza(Integer notaEngleza) {
        this.notaEngleza = notaEngleza;
    }

    public double getMedie(){
        return (notaEngleza+notaMatematica+notaInformatica)/3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", notaMatematica=" + notaMatematica +
                ", notaInformatica=" + notaInformatica +
                ", notaEngleza=" + notaEngleza +
                '}';
    }
}
