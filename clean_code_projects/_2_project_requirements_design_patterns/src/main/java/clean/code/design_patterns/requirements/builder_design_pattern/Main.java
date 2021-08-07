package clean.code.design_patterns.requirements.builder_design_pattern;

public class Main {

    public static void main(String[] args){

        Tax intretinere = new Tax.Builder(
                200,
                "intretinere",
                "10.10.2020",
                "10.11.2020")
                .isPaid(false)
                .additionalInfo("A se plati la caserie, miercurea intre orele 17 si 19")
                .build();

    }
}
