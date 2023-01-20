package clean.code.design_patterns.requirements;

public class DOCX implements Document {
    private String type;
    private int max_size;
    private static int count = 0;
    DOCX (String type) {
        System.out.println("A document of type " + type + " was created.");
        this.type = type;
        this.max_size = 4;
        ++count;
    }
    @Override
    public String requestDocType() {
        return type;
    }
    @Override
    public int requestMaxSize() {
        return max_size;
    }
    @Override
    public int requestNumberOfDocs() {
        return count;
    }
}