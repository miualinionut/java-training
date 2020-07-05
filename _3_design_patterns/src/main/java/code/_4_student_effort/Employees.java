package code._4_student_effort;

public class Employees {
    public static class DesginPat {
        public static Person getPerson(String name, String gender) {
            if (gender.equalsIgnoreCase("M")) {
                return new Male(name);
            } else if (gender.equalsIgnoreCase("F")) {
                return new Female(name);
            }
            return null;
        }

    }



    static abstract class Person {

        Person(String name) {
            this.name = name;

        }
        private String name;
        abstract String getSalutation();
        String getNameAndSalutation() {
        }
    }

    static class Male extends Person {
        public Male(String name) {
            super(name);
        }

        @Override
        String getSalutation() {
            return "Mr";
        }
    }

    static class Female extends Person {
        public Female(String name) {
            super(name);
        }

        @Override
        String getSalutation() {
            return "Mrs/Miss";
        }
    }

    public static void main(String[] args) {
        Person male = Employees.DesginPat.getPerson("Alex", "M");
        System.out.println(male.getNameAndSalutation);

        Person female = Employees.DesginPat.getPerson("Ana", "F");
        System.out.println(female.getNameAndSalutation);

    }
    }

