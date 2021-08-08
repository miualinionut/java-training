package clean.code.design_patterns.requirements.Data;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    private String name;
    private String pass;
    private PersonTypes type;

    public Person(String name, String pass) {
        this.name = name;
        this.pass = pass;
        this.type = PersonTypes.CLIENT;
    }

    public Person(String name, String pass, PersonTypes type) {
        this.name = name;
        this.pass = pass;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public PersonTypes getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        for (int i = 0; i < this.name.length(); i++) {
            hash = hash*31 + this.name.charAt(i);
        }
        return hash;
    }
}
