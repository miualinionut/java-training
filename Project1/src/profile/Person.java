package profile;

public enum Person {
    MALE("Male"),
    FEMALE("Female");

    public final String gender;

    Person(String gender) {
        this.gender = gender;
    }
}
