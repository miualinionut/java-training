package clean.code.design_patterns.requirements.Presentation;

import java.io.Serializable;

public class GUI implements Serializable {

    private AdminGUI adminGUI;
    private ClientGUI clientGUI;
    private EmployeeGUI employeeGUI;
    private LogInGUI logInGUI;

    public GUI(){
        this.adminGUI = new AdminGUI();
        this.clientGUI = new ClientGUI();
        this.employeeGUI = new EmployeeGUI();
        this.logInGUI = new LogInGUI();

        clientGUI.setVisible(false);
        adminGUI.setVisible(false);
        employeeGUI.setVisible(false);
        logInGUI.setVisible(true);
    }

    public AdminGUI getAdminGUI() {
        return adminGUI;
    }

    public ClientGUI getClientGUI() {
        return clientGUI;
    }

    public EmployeeGUI getEmployeeGUI() {
        return employeeGUI;
    }

    public LogInGUI getLogInGUI() {
        return logInGUI;
    }
}
