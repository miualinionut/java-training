package code._3_in_class;

public class Student2{
    //campuri required
    private String nume;

    //campuri optionale
    private String telefonFix;
    private String avionPersonal;

    public Student2(String nume, String telefonFix, String avionPersonal) {
        this.nume = nume;
        this.telefonFix = telefonFix;
        this.avionPersonal = avionPersonal;
    }

    public static class Builder {
        //campuri required
        private String nume;

        //campuri optionale
        private String telefonFix;
        private String avionPersonal;

        public Builder nume(String nume){
            this.nume = nume;
            return this;
        }

        public Builder telefonFix(String telefonFix){
            this.telefonFix = telefonFix;
            return this;
        }

        public Builder avionPersonal(String avionPersonal){
            this.avionPersonal = avionPersonal;
            return this;
        }

        public Student2 build(){
            return new Student2(nume, telefonFix, avionPersonal);
        }
    }
}