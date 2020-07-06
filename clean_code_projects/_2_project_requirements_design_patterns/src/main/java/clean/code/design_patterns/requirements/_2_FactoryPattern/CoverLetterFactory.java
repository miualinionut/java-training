package clean.code.design_patterns.requirements._2_FactoryPattern;

public class CoverLetterFactory {
    public CoverLetter getCoverLetter(String type){
        if(type == null)
            return null;
        if(type.equalsIgnoreCase("Bussiness"))
            return new BussinessCoverLetter();
        if(type.equalsIgnoreCase("IT"))
            return new ITCoverLetter();
        if(type.equalsIgnoreCase("HR"))
            return new HRCoverLetter();

        return null;
    }
}
