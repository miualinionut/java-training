package code._4_student_effort.Singleton;

import code._4_student_effort.Command.TipAnaliza;



//Pentru solutia software anterioara folosită de laborator, managerul
       // care se ocupă de coada de comenzi sau de lista de clienți să fie unic (se poate alege orice context dintre
       // cele 2), astfel încât să nu se genereze probleme legate de modul în care sunt gestionați clienții sau
        //analizele medicale. Se dorește implementarea clasei ManagerLaborator, astfel încât să asigure faptul că
        //acesta este unic. Entitatea de tip ManagerLaborator este descrisă de 2 atribute alese liber.
       // Se testeaza  soluția prin exemplificarea scenariului în care sunt create două sau mai multe obiecte de tip ManagerLaborator și se demonstrează că acestea reprezintă aceeași instanță.

public class Program {
    public static void main(String[] args) {
        GestiuneAnalize spital = new GestiuneAnalize();
        spital.inregistrareAnalizaNoua("Corina", "asafa@gmail.com", TipAnaliza.COVID);

        ManagerLaborator manager = ManagerLaborator.getInstanta("Corina", 0.2, spital);
        ManagerLaborator managerUnic = ManagerLaborator.getInstanta("Marius", 500, null);

        //verificam ca avem aceeasi referinta catre obiectul spital in ambele obiecte
        //   de tip ManagerLaborator
        if(manager.getGestionar().equals(managerUnic.getGestionar())) {
            System.out.println("Doar o instanta s-a creat!");
        }
    }
}
