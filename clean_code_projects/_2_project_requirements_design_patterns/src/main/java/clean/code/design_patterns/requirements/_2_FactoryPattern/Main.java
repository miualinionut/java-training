package clean.code.design_patterns.requirements._2_FactoryPattern;

public class Main {
    public static void main(String[] args) {
        CoverLetterFactory cov = new CoverLetterFactory();

        CoverLetter letter1 = cov.getCoverLetter("IT");
        letter1.create();

        CoverLetter letter2 = cov.getCoverLetter("HR");
        letter2.create();

        CoverLetter letter3 = cov.getCoverLetter("Bussiness");
        letter3.create();

    }
}
