package code._4_student_effort.phonebook;

public class Phonebook {
    // required parameters
    private String name;
    private String number;

    private Phonebook(Builder builder) {
        this.name   = builder.name;
        this.number = builder.number;
    }

    public String getName() { return name; }

    public String getNumber() { return number; }

    // builder design pattern
    public static class Builder {
        private String name;
        private String number;

        public Builder(String name, String number) {
            this.name   = name;
            this.number = number;
        }

        public Phonebook build() { return new Phonebook(this); }
    }
}
