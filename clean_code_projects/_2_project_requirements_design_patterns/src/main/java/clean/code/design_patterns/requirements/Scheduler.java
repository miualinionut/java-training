package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Scanner;

public class Scheduler {
    private static List<String> allSurgeries = new ArrayList<String>();


    public static void scheduleSurgery(List<Employee> employees) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder surgery = new StringBuilder();
        surgery.append("The doctor is ");
        System.out.println("Enter the name of the doctor:");
        String doc = scanner.nextLine();
        surgery.append(doc);
        surgery.append(", the nurse is ");
        System.out.println("Enter the name of the nurse:");
        String nurse = scanner.nextLine();
        surgery.append(nurse);
        surgery.append(", the anesthesiologist is ");
        System.out.println("Enter the name of the anesthesiologist:");
        String ans = scanner.nextLine();
        surgery.append(ans);
        surgery.append(", the date and time are ");
        System.out.println("Enter the date and time for the surgery:");
        String dt = scanner.nextLine();
        surgery.append(dt);
        surgery.append(", for patient named ");
        System.out.println("Enter the name of the patient:");
        String p = scanner.nextLine();
        surgery.append(p);

        allSurgeries.add(String.valueOf(surgery));
        notifyUpdate(String.valueOf(surgery), doc, nurse, ans, employees);
    }


    public static void notifyUpdate(String surgery, String doctor, String nurse, String anesthesiologist, List<Employee> employees) {
        Iterator<Employee> it = employees.iterator();

        while (it.hasNext()) {
            Employee e = it.next();
            e.update(surgery);
            if (doctor.equals(e.getName())) {
                System.out.println("Notified doctor " + doctor + " about details of the surgery: " + surgery + '\n');
            } else if (nurse.equals(e.getName())) {
                System.out.println("Notified nurse " + nurse + " about details of the surgery: " + surgery + '\n');
            } else if (anesthesiologist.equals(e.getName())){
                System.out.println("Notified anesthesiologist " + anesthesiologist + " about details of the surgery: " + surgery + '\n');
            }
        }
    }
}
