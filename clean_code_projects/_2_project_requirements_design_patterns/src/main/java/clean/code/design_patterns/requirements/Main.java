package clean.code.design_patterns.requirements;

import clean.code.design_patterns.requirements.DoctorRepository.DoctorRepository;
import clean.code.design_patterns.requirements.Service.Service;
import clean.code.design_patterns.requirements.UI.UserInterface;
import clean.code.design_patterns.requirements.Validate.Validator;
public class Main {
    public static void main(String[] args) {

        DoctorRepository repo = new DoctorRepository();
        Validator validator = new Validator();
        Service service = new Service(repo,validator);
        UserInterface ui = new UserInterface(service);
        ui.start();
    }
}