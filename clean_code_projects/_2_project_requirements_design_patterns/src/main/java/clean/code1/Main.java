package clean.code1;

public class Main {
    public static void main(String[] args) {

        CustomPillow pillow01 = new CustomPillow.Builder("Rainbow")
                .color("multicolor")
                .weight(200)
                .fabric("silk")
                .filling("wadding")
                .build();

        CustomPillow pillow02 = new CustomPillow.Builder("SunShine")
                .color("yellow") //am scos greutatea
                .fabric("cloth")
                .filling("wadding")
                .build();

        CustomPillow pillow03 = new CustomPillow.Builder("Aqua")
                .color("blue")
                .weight(212)
                //am scos materialul
                .filling("wadding")
                .build();


    }
}
