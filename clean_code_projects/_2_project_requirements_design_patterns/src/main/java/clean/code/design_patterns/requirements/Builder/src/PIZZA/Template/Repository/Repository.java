package clean.code.design_patterns.requirements.Builder.src.PIZZA.Template.Repository;


import clean.code.design_patterns.requirements.Builder.src.PIZZA.Template.Domain.Site;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Repository {
    public static void write(Site site_Basic) {
        try {
            FileWriter myWriter = new FileWriter("SITE");
            PrintWriter printWriter = new PrintWriter(myWriter);

            printWriter.println("<html>");
            printWriter.println(site_Basic.Title);
            printWriter.println(site_Basic.Header);
            printWriter.println(site_Basic.Body);
            printWriter.println(site_Basic.Footer);
            printWriter.println("</html>");

            printWriter.close();
            myWriter.close();

            System.out.println("Site generat cu succes!");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
    }
}}
