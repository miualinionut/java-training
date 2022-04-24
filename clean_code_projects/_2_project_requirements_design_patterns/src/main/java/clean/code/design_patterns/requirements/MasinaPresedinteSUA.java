package clean.code.design_patterns.requirements;

public class MasinaPresedinteSUA {

    private static MasinaPresedinteSUA singuraInstanta;

    private MasinaPresedinteSUA(){
    }

    public void fuge() {
        System.out.println("Masina presedintelui SUA nu sta la semafor");
    }

    public static MasinaPresedinteSUA getInstance() {
        if (singuraInstanta == null) {
            singuraInstanta = new MasinaPresedinteSUA();
        }

        return singuraInstanta;
    }
}
