package clean.code.design_patterns.requirements.Builder;

import java.util.Date;

public class RegistrationForm {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private Date birthday;
    private int age;
    private String country;
    private boolean newsletter;

    private RegistrationForm(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.username= builder.username;
        this.email= builder.email;
        this.password = builder.password;
        this.birthday= builder.birthday;
        this.age = builder.age;
        this.country = builder.country;
        this.newsletter = builder.newsletter;
    }

    private static class Builder{
        private String firstName;
        private String lastName;
        private String username;
        private String password;
        private String email;
        private Date birthday;
        private int age;
        private String country;
        private boolean newsletter;

        public Builder(String firstName, String lastName, String username, String password, String email){
            this.firstName = firstName;
            this.lastName=lastName;
            this.email = email;
            this.password = password;
            this.username = username;
        }

        public Builder setBirthday(Date birthday){
            this.birthday = birthday;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setCountry(String country){
            this.country = country;
            return this;
        }

        public Builder setNewsletter(boolean newsletter){
            this.newsletter = newsletter;
            return this;
        }

        public RegistrationForm build(){return new RegistrationForm(this);}
    }

    public static void main(String[] args) {
        RegistrationForm newUser = new RegistrationForm.Builder("John","Doe","johndoe","password","jd@example.com").setAge(25).setNewsletter(true).build();
    }
    
}
