package clean.code.design_patterns.requirements.platform.util;


import org.jetbrains.annotations.NotNull;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.sql.Timestamp;
import java.util.Date;

public class AuditCsvService {
    private static AuditCsvService instance = null;
    private final PrintStream fout;

    private AuditCsvService() throws FileNotFoundException {
        final String dir = "clean_code_projects/_2_project_requirements_design_patterns/data/";
        fout = new PrintStream(new FileOutputStream(dir+"audit.csv", true));
    }

    public void writeCsv(@NotNull String actionName) {
        fout.println(actionName + ", " + new Timestamp((new Date()).getTime()));
        System.out.println(actionName);
    }

    public static AuditCsvService getInstance() {
        if (instance == null) {
            try {
                instance = new AuditCsvService();
            } catch (FileNotFoundException e) {
                System.out.println("Exception in AuditCsvService.java: getInstance: " + e);
            }
        }
        return instance;
    }
}
