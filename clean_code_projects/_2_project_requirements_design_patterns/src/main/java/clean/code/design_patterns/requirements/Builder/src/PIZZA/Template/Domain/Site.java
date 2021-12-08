package clean.code.design_patterns.requirements.Builder.src.PIZZA.Template.Domain;

public class Site {
    public final String Title;
    public final String Header;
    public final String Body;
    public final String Footer;

    public Site(String Title, String Header, String Body, String Footer){
        this.Header = Header;
        this.Body = Body;
        this.Footer = Footer;
        this.Title = Title;
    }
}
