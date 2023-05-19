package code._3_in_class.builder;

public class Main {
    public static void main(String[] args) {

        Student student05 = new StudentBuilder("Popescu","Facultate")
                .setGreutate(80.6)
                .setAdresa("undeva")
                .setNumeSora01("Maria")
                .setCuloarePreferata("albastru")
                .build();

    }
}
