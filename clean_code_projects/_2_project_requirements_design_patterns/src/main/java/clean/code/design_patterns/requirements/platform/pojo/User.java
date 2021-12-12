package clean.code.design_patterns.requirements.platform.pojo;

import org.jetbrains.annotations.NotNull;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Objects;

public abstract class User {
    final int id;
    @NotNull
    final String userName;
    @NotNull
    final Date birthDate;
    @NotNull
    String address;
    @NotNull
    String phoneNumber;
    static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public User(@NotNull Builder builder) {
        this.id = builder.id;
        this.userName = builder.userName;
        this.birthDate = builder.birthDate;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
    }

    public @NotNull String getUserName() {
        return userName;
    }

    public int getId() {
        return id;
    }

    public @NotNull Date getBirthDate() {
        return birthDate;
    }

    public @NotNull String getAddress() {
        return address;
    }

    public void setAddress(@NotNull String address) {
        this.address = address;
    }

    public @NotNull String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(@NotNull String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", id=" + id +
                ", birthDate=" + simpleDateFormat.format(birthDate) +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id == user.id && userName.equals(user.userName) && birthDate.equals(user.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, id, birthDate);
    }

    abstract public String toStringCsv();

    public static abstract class Builder {
        Integer id;
        @NotNull
        final String userName;
        @NotNull
        final Date birthDate;
        @NotNull
        String address;
        @NotNull
        String phoneNumber;
        static int co = 0;

        Builder(@NotNull String userName, @NotNull Date birthDate) {
            this.userName = userName;
            this.birthDate = birthDate;
            this.address = "";
            this.phoneNumber = "";
        }

        public Builder setId(@NotNull Integer id) {
            this.id = id;
            if (id > co)
                co = id;
            return this;
        }

        public Builder setAddress(@NotNull String address) {
            this.address = address;
            return this;
        }

        public Builder setPhoneNumber(@NotNull String phoneNumber) throws IllegalArgumentException {
            if (phoneNumber.length() != 0 && phoneNumber.length() != 10)
                throw new IllegalArgumentException("Invalid phone number length");
            this.phoneNumber = phoneNumber;
            return this;
        }

        public abstract User build();

    }
}
