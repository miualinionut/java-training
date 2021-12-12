package clean.code.design_patterns.requirements.platform.pojo;

import org.jetbrains.annotations.NotNull;

import java.sql.Date;

public final class TeachingAssistant extends User {
    @NotNull
    final Teacher supervisorTeacher;

    public TeachingAssistant(@NotNull TeachingAssistant.Builder builder) {
        super(builder);
        this.supervisorTeacher = builder.supervisorTeacher;
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

    public static final class Builder extends User.Builder {
        @NotNull
        Teacher supervisorTeacher;

        public Builder(@NotNull String userName, @NotNull Date birthDate, @NotNull Teacher supervisorTeacher) {
            super(userName, birthDate);
            this.supervisorTeacher = supervisorTeacher;
        }

        @Override
        public TeachingAssistant build() {
            if (id == null)
                id = ++co;
            return new TeachingAssistant(this);
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
