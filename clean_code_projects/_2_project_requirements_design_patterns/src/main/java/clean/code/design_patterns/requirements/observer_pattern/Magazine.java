package clean.code.design_patterns.requirements.observer_pattern;

public class Magazine {
    private String title;
    private Integer nrOfPages, publicationYear;

    public Magazine(String title, Integer nrOfPages, Integer publicationYear) {
        this.title = title;
        this.nrOfPages = nrOfPages;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getNrOfPages() {
        return nrOfPages;
    }

    public void setNrOfPages(Integer nrOfPages) {
        this.nrOfPages = nrOfPages;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }
}
