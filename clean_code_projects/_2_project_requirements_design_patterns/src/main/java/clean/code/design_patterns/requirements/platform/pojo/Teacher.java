package clean.code.design_patterns.requirements.platform.pojo;

import org.jetbrains.annotations.NotNull;

import java.sql.Date;

public final class Teacher extends User {
    @NotNull String ranking;

    public Teacher(@NotNull String userName, @NotNull Date birthDate, @NotNull String rank, @NotNull String address, @NotNull String phoneNumber) {
        super(userName, birthDate, address, phoneNumber);
        this.ranking = rank;
    }

    public Teacher(int id, @NotNull String userName, @NotNull Date birthDate, @NotNull String rank, @NotNull String address, @NotNull String phoneNumber) {
        super(id, userName, birthDate, address, phoneNumber);
        this.ranking = rank;
    }

    public @NotNull String getRank() {
        return ranking;
    }

    public void setRank(@NotNull String rank) {
        this.ranking = rank;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "userName='" + userName + '\'' +
                ", id=" + id +
                ", ranking='" + ranking + '\'' +
                ", birthDate=" + simpleDateFormat.format(birthDate) +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public String toStringCsv() {
        return id + ", " + userName + ", " + simpleDateFormat.format(birthDate) + ", " + ranking + ", " + address + ", " + phoneNumber;
    }
}
