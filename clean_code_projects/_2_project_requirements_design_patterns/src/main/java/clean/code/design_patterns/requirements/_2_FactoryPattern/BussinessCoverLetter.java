package clean.code.design_patterns.requirements._2_FactoryPattern;

public class BussinessCoverLetter implements CoverLetter{
    @Override
    public void create() {
        System.out.println("Model de cover letter bussiness");
    }
}
