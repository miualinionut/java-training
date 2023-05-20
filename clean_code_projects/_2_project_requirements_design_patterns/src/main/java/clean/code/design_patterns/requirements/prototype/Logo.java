package clean.code.design_patterns.requirements.prototype;

// Clasa Logo, care va fi clonată
public class Logo implements Cloneable {
    private String imagine;

    public Logo(String imagine) {
        this.imagine = imagine;
    }

    public void setImagine(String imagine) {
        this.imagine = imagine;
    }

    public String getImagine() {
        return imagine;
    }

    @Override
    public Logo clone() throws CloneNotSupportedException {
        return (Logo) super.clone();
    }
}

