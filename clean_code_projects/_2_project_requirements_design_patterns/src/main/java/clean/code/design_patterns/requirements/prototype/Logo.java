// Clasa Logo, care va fi clonată
class Logo implements Cloneable {
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

