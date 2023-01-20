package clean.code.design_patterns.requirements;

public class DocumentFactory {
    public static Document createDocument (String type) {
        switch (type) {
            case "XLSX":
                return new XLSX(type);
            case "PDF":
                return new PDF(type);
            case "DOCX":
                return new DOCX(type);
            case "HTML":
                return new HTML(type);
            case "TXT":
                return new TXT(type);
            default:
                throw new IllegalArgumentException ("Unknown type: " + type);
        }
    }
}