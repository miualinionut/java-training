package clean.code.design_patterns.requirements.Builder.src.PIZZA.Template.services;

public class SiteBasic extends AbstractSite{

    @Override
    public String getHeader() {
        return "<header>" + "\n" +
                "<style>" + "\n" +
                "body {" +  "\n" +
                "background-color: bleumarin; }" +  "\n" +

                "h1 {" +  "\n" +
                "color: black;" +  "\n" +
                "text-align: center;" +  "\n" +
                "  font-family: \"Verdana\"};" +  "\n" +

                "h2 {" +  "\n" +
                "color: black;" +  "\n" +
                "  font-family: \"Arial\"};" +  "\n" +

                "</style>"  +  "\n" +
                "<h1> Motor diesel </h1>" +  "\n" +
                "</header>";
    }

    @Override
    public String getBody() {
        return  "<body>"  + "\n" +
                "<h2> Motorul diesel este un motor cu ardere internă în care combustibilul se aprinde datorită" +
                " temperaturii ridicate create de comprimarea aerului necesar arderii, și nu prin utilizarea unui" +
                " dispozitiv auxiliar, așa cum ar fi bujia în cazul motorului cu aprindere prin scânteie.\n" +
                "\n" +
                "Motorul lucrează pe baza ciclului Diesel.  </h2>" + "\n" +

                "<h1> Istorie </h1>" + "\n" +
                "<h2>" + "\n" +
                "Numele motorului a fost dat după inginerul german Rudolf Diesel la sugestia soției sale, Martha" +
                " Diesel, care în 1895 îl sfătuiește cu: Nenn ihn doch einfach Dieselmotor! („numește-l pur și " +
                "simplu motor Diesel!”),ușurînd astfel lui Diesel căutarea după denumirea motorului, pe care" +
                " l-a inventat în 1892 și l-a patentat pe 23 februarie 1893. Intenția lui Diesel a fost ca motorul " +
                "său să utilizeze o gamă largă de combustibili, inclusiv praful de cărbune. Diesel și-a prezentat " +
                "invenția funcționând în 1900 la Expoziția Universală (World's Fair) având drept combustibil ulei " +
                "de alune. " + "\n" +
                "</h2>" + "\n" +

                "<h1> Cum functioneaza motorul diesel? </h1>" + "\n" +
                "<h2> Comprimarea unui gaz conduce la creșterea temperaturii sale, aceasta fiind metoda prin care" +
                " se aprinde combustibilul în motoarele diesel. Aerul este aspirat în cilindri și este comprimat de" +
                " către piston până la un raport de 25:1, mai ridicat decât cel al motoarelor cu aprindere prin" +
                " scânteie. Spre sfârșitul cursei de comprimare motorina (combustibilul) este pulverizată în camera" +
                " de ardere cu ajutorul unui injector. Motorina se aprinde la contactul cu aerul deja încălzit prin" +
                " comprimare până la o temperatura de circa 700-900 °C. Arderea combustibilului duce la creșterea" +
                " temperaturii și presiunii, care acționează pistonul. În continuare, ca la motoarele obișnuite," +
                " biela transmite forța pistonului către arborele cotit, transformând mișcarea liniară în mișcare" +
                " de rotație. Aspirarea aerului în cilindri se face prin intermediul supapelor, dispuse la capul" +
                " cilindrilor. Pentru mărirea puterii, majoritatea motoarelor diesel moderne sunt supraalimentate" +
                " cu scopul de a mări cantitatea de aer introdusă în cilindri. Folosirea unui răcitor intermediar" +
                " pentru aerul introdus în cilindri crește densitatea aerului și conduce la un randament mai bun.\n" +
                "</h2>";
    }

    @Override
    public String getFooter() {
        return "<h2> Creat pentru Client, Basic; Program Generator Site creat de Man Robert-Daniel </h2>" + "\n" +
                "</body";
    }
}
