package code._4_student_effort.Proxy;

public class Student {
     private String name;
     private int money;

     public Student(String name, int money){
         this.name = name;
         this.money = money;
     }
     public String getName(){
         return this.name;
     }

     public int getMoney(){
         return this.money;
     }

     public String toString(){
         return "Student{name="+getName()+", money="+getMoney()+"}";
    }

}
