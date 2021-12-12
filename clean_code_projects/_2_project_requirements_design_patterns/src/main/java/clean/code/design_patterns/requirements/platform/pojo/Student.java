package clean.code.design_patterns.requirements.platform.pojo;

import org.jetbrains.annotations.NotNull;

import java.sql.Date;

public final class Student extends User {

    public Student(@NotNull String userName, @NotNull Date birthDate, @NotNull String address, @NotNull String phoneNumber) {
        super(userName, birthDate, address, phoneNumber);
    }

    public Student(int id, @NotNull String userName, @NotNull Date birthDate, @NotNull String address, @NotNull String phoneNumber) {
        super(id, userName, birthDate, address, phoneNumber);
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
}
