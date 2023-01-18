package clean.code.design_patterns.requirements;

import clean.code.design_patterns.requirements.Repository.Repository;
import clean.code.design_patterns.requirements.Service.Service;
import clean.code.design_patterns.requirements.UI.Ui;
import clean.code.design_patterns.requirements.Validate.AngajatValidator;

public class Main {

    public static void main(String[] args) {
//        Angajat a1 = new Angajat("a","b","c",1000.0);
//        Angajat a2 = new Angajat("d","e","f",1000.0);
//        Angajat a3 = new Angajat("g","h","i",1000.0);
        Repository repo = new Repository();
        AngajatValidator validator = new AngajatValidator();
        Service service = new Service(repo,validator);
        Ui ui = new Ui(service);
        ui.start();
    }
}
