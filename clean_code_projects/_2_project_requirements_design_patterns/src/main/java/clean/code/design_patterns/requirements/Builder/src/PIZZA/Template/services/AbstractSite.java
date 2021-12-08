package clean.code.design_patterns.requirements.Builder.src.PIZZA.Template.services;


import clean.code.design_patterns.requirements.Builder.src.PIZZA.Template.Domain.Site;
import clean.code.design_patterns.requirements.Builder.src.PIZZA.Template.Repository.Repository;

public abstract class AbstractSite {
    public String title = "<title>" + "\n" + "Motorul Diesel" + "\n" + "</title>";

    public void CreateSite(){
        String header = getHeader();
        String body = getBody();
        String footer = getFooter();
        Site site = new Site(title, header,body, footer);

        Repository.write(site);
    }

    public abstract String getHeader();
    public abstract String getBody();
    public abstract String getFooter();
}
