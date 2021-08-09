package filter.pattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args) {
      List<Students> students= new ArrayList<Students>();

      students.add(new Students("Ana","IE",2,"with scholarship"));
      students.add(new Students("Maria","CIG",3,"without scholarship"));
      students.add(new Students("Raluca","CIG",1,"with scholarship"));
      students.add(new Students("Andrei","IE",2,"without scholarship"));
      students.add(new Students("Razvan","CIG",1,"with scholarship"));
      students.add(new Students("Andra","IE",3,"without scholarship"));
      students.add(new Students("Marius","CIG",3,"with scholarship"));
      students.add(new Students("Anca","IE",1,"without scholarship"));
      students.add(new Students("Narcis","IE",3,"without scholarship"));
      students.add(new Students("Nadia","IE",2,"without scholarship"));


      Criteria ie= new ieProfile();
      Criteria cig=new cigProfile();
      Criteria withScholarship=new CriteriaScholarship();
      Criteria withoutScholarship=new CriteriawithoutScholarship();
      Criteria ieWithScholarship=new andCriteria(ie,withScholarship);
      Criteria cigOrWithoutScholarship=new orCriteria(cig,withoutScholarship);

      System.out.println("IE: ");
      printStudents(ie.meetCriteria(students));

      System.out.println("CIG: ");
      printStudents(cig.meetCriteria(students));

      System.out.println("With scholarship: ");
      printStudents(withScholarship.meetCriteria(students));

      System.out.println("Without scholarship: ");
      printStudents(withoutScholarship.meetCriteria(students));

      System.out.println("IE whit scholarship: ");
      printStudents(ieWithScholarship.meetCriteria(students));

      System.out.println("Cig Or WithoutScholarship: ");
      printStudents(cigOrWithoutScholarship.meetCriteria(students));

}
 public static void printStudents(List<Students> students){
      for (Students student : students) {
         System.out.println("Student : " + student.getName()+ ", profile: " +student.getProfile() + ", year:" +student.getYear() + ", scholarship: " + student.getScholarship());
      }

   }
}
