package clean.code.design_patterns.requirements.platform.pojo;

import org.jetbrains.annotations.NotNull;

import java.sql.Date;

public final class Student extends User {

    public Student(@NotNull Student.Builder builder) {
        super(builder);
    }

    @Override
    public String toString() {
        return "Student{" +
                "userName='" + userName + '\'' +
                ", id=" + id +
                ", birthDate=" + simpleDateFormat.format(birthDate) +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public String toStringCsv() {
        return id + ", " + userName + ", " + simpleDateFormat.format(birthDate) + ", " + address + ", " + phoneNumber;
    }

    public static final class Builder extends User.Builder {

        public Builder(@NotNull String userName, @NotNull Date birthDate) {
            super(userName, birthDate);
        }

        @Override
        public Student build() {
            if (id == null)
                id = ++co;
            return new Student(this);
        }

        @Override
        public Builder setId(@NotNull Integer id) {
            return (Builder) super.setId(id);
        }

        @Override
        public Builder setAddress(@NotNull String address) {
            return (Builder) super.setAddress(address);
        }

        @Override
        public Builder setPhoneNumber(@NotNull String phoneNumber) throws IllegalArgumentException {
            return (Builder) super.setPhoneNumber(phoneNumber);
        }
    }
}
