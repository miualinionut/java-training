package clean.code.design_patterns.requirements.platform.pojo;

import org.jetbrains.annotations.NotNull;

import java.sql.Date;

public final class TeachingAssistant extends User {
    @NotNull
    final Teacher supervisorTeacher;

    public TeachingAssistant(@NotNull String userName, @NotNull Date birthDate, @NotNull Teacher supervisorTeacher, @NotNull String address, @NotNull String phoneNumber) {
        super(userName, birthDate, address, phoneNumber);
        this.supervisorTeacher = supervisorTeacher;
    }

    public TeachingAssistant(int id, @NotNull String userName, @NotNull Date birthDate, @NotNull Teacher supervisorTeacher, @NotNull String address, @NotNull String phoneNumber) {
        super(id, userName, birthDate, address, phoneNumber);
        this.supervisorTeacher = supervisorTeacher;
    }

    public @NotNull Teacher getSupervisorTeacher() {
        return supervisorTeacher;
    }

    @Override
    public String toString() {
        return "TeachingAssistant{" +
                "supervisorTeacher=" + supervisorTeacher +
                ", userName='" + userName + '\'' +
                ", id=" + id +
                ", birthDate=" + simpleDateFormat.format(birthDate) +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public String toStringCsv() {
        return id + ", " + userName + ", " + simpleDateFormat.format(birthDate) + ", " + supervisorTeacher.id + ", " + address + ", " + phoneNumber;
    }
}
