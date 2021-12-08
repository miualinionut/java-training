package clean.code.design_patterns.requirements.Builder.src.PIZZA.Template.services;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class SiteCustom extends AbstractSite {
    // pachetul services nu e chiar services, deoarece se citesc date de la client

    private String GetFont() {
        while (true) {
            Map<String, String> font = new HashMap<>();
            font.put("1", "Arial");
            font.put("2", "Verdana");
            font.put("3", "Comic Sans MS");
            font.put("4", "Trebuchet MS");

            System.out.println("1. Fontul sa fie Arial ");
            System.out.println("2. Fontul sa fie Verdana ");
            System.out.println("3. Fontul sa fie Comic Sans Ms ");
            System.out.println("4. Fontul sa fie Trebuchet MS ");

            String optiune = getOptiune();

            if(font.containsKey(optiune)){
                return font.get(optiune);
            }
            System.out.println("Optiune gresita!");
        }
        }


    private String getOptiune() {
        String optiune;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ce optiune alegeti? ");
        optiune = scan.next();
        return optiune;
    }

    private String GetAliniere() {
        while (true) {
            Map<String, String> aliniere = new HashMap<>();
            aliniere.put("1", "left");
            aliniere.put("2", "center");
            aliniere.put("3", "right");

            System.out.println("1. Aliniere la stanga ");
            System.out.println("2. Aliniere la centru ");
            System.out.println("3. Aliniere la dreapta");

            String optiune = getOptiune();

            if(aliniere.containsKey(optiune)){
                return aliniere.get(optiune);
            }
            System.out.println("Optiune gresita!");
        }
    }

    private String GetCuloareText() {
        while (true) {
            Map<String, String> colors = new HashMap<>();
            colors.put("1", "black");
            colors.put("2", "gray");
            colors.put("3", "blue");

            System.out.println("1. Culoarea neagra ");
            System.out.println("2. Culoarea gri ");
            System.out.println("3. Culoarea albastru");

            String optiune = getOptiune();

            if(colors.containsKey(optiune)){
                return colors.get(optiune);
            }
            System.out.println("Optiune gresita!");

        }
    }

    private String GetCuloareBackground() {
        while (true) {
            Map<String, String> colors = new HashMap<>();
            colors.put("1", "white");
            colors.put("2", "bleumarin");
            colors.put("3", "yellow");
            colors.put("4", "lightblue");

            System.out.println("1. Culoarea sa fie alba ");
            System.out.println("2. Culoarea sa fie bluemarin ");
            System.out.println("3. Culoarea sa fie galbena ");
            System.out.println("4. Culoarea sa fie albastru deschis ");

            String optiune = getOptiune();

            if(colors.containsKey(optiune)){
                return colors.get(optiune);
            }
            System.out.println("Optiune gresita!");
        }
    }

    @Override
    public String getHeader() {
        System.out.println("Setare culoare background");
        String OptiuneCuloare = GetCuloareBackground();

        System.out.println("Setare culoare Titluri ");
        String OptiuneTextTitlu = GetCuloareText();

        System.out.println("Setare aliniere titluri ");
        String OptiuneAliniere = GetAliniere();

        System.out.println("Setare font Titluri ");
        String OptiuneFontTitlu = GetFont();

        System.out.println("Dati primul titlu (unul potrivit in legatura cu motoarele diesel) ");
        String Titlu1 = GetTitlu();


        return "<header>" + "\n" +
                "<style>" + "\n" +
                "body {" +  "\n" +
                "background-color:" + OptiuneCuloare + "; }" +  "\n" +

                "h1 {" +  "\n" +
                "color:" + OptiuneTextTitlu + ";" +  "\n" +
                "text-align:" +  OptiuneAliniere + ";" +  "\n" +
                "  font-family:  " + OptiuneFontTitlu + "};" +  "\n" +
                "</style>"  +  "\n" +
                "<h1>" + Titlu1 + "</h1>" +  "\n" +
                "</header>";
    }

    private String GetTitlu() {
        String titlu;
        Scanner scan = new Scanner(System.in);
        titlu = scan.nextLine();

        String subliniere;
        System.out.println("1. Daca doriti ca acest titlu sa fie subliniat ");
        System.out.println("Oricare alta tasta. Daca nu doriti ca acest titlu sa fie subliniat ");
        subliniere = scan.next();
        if(Objects.equals(subliniere, "1"))
            return "<u>" + titlu + "</u>";
        return titlu;
    }

    @Override
    public String getBody() {

        System.out.println("Dati al 2 lea titlu (unul potrivit in legatura cu motoarele diesel) ");
        String Titlu2 = GetTitlu();

        System.out.println("Dati al 3 lea titlu (unul potrivit in legatura cu motoarele diesel) ");
        String Titlu3 = GetTitlu();


        System.out.println("Setare culoare Text Continut ");
        String OptiuneTextContinut = GetCuloareText();

        System.out.println("Setare font Text Continut");
        String OptiuneFontContinut = GetFont();

        System.out.println("Continutul primului paragraf ");
        String continut1 = GetContinut();

        System.out.println("Continutul celui de-al 2 lea paragraf ");
        String continut2 = GetContinut();

        System.out.println("Continutul celui de-al 3 lea paragraf ");
        String continut3 = GetContinut();

        System.out.println("Setare aliniere continut");
        String OptiuneAliniereText = GetAliniere();

        return "<body>"  + "\n" +
                "<style>" + "\n" +
                "h2 {" +  "\n" +
                "color:" + OptiuneTextContinut + ";" +  "\n" +
                "text-align:" +  OptiuneAliniereText + ";" +  "\n" +
                "  font-family:  " + OptiuneFontContinut + "};" +  "\n" +
                "</style>"  +  "\n" +
                "<h2>" + continut1 + ".\n" +
                "\n" +
                "</h2>" +

                "<h1>" + Titlu2 +  "</h1>" + "\n" +
                "<h2>" + continut2 +   ".\n" +
                "\n" +
                "</h2>" + "\n" +

                "<h1>" + Titlu3 + "</h1>" + "\n" +
                "<h2>" + continut3 +   ".\n" +
                "\n" +
                "</h2>";
    }

    private String GetImagini() {
        String imagini;
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Daca doriti ca acest site sa aiba imagini potrivite despre motoare diesel ");
        System.out.println("Oricare alta tasta. Daca nu doriti ca acest site sa nu aiba imagini ");
        imagini = scan.nextLine();
        if(Objects.equals(imagini, "1"))
            return "<img src='motor1.png' width='700' height='350' align='left'>" +
                    "<img src='motor2.png' width='700' height='350' align='right'>";
        return "";
    }

    private String GetContinut() {
        String continut;
        Scanner scan = new Scanner(System.in);
        continut = scan.nextLine();

        String subliniere;
        System.out.println("1. Daca doriti ca acest paragraf sa fie subliniat ");
        System.out.println("Oricare alta tasta. Daca nu doriti ca acest paragraf sa fie subliniat ");
        subliniere = scan.next();
        if(Objects.equals(subliniere, "1"))
            return "<u>" + continut + "</u>";
        return continut;
    }

    @Override
    public String getFooter() {
        System.out.println("Setare imagini");
        String ImaginiPortrivite = GetImagini();

        return "<h1>Creat pentru Client, Custom; Program Generator site creat de Man Robert-Daniel</h1>" + "\n" +
                ImaginiPortrivite +
                "</body";
    }
}
