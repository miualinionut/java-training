package clean.code.design_patterns.requirements.platform.pojo;

import org.jetbrains.annotations.NotNull;

import java.sql.Date;

public final class Teacher extends User {
    @NotNull String ranking;

    public Teacher(@NotNull Teacher.Builder builder) {
        super(builder);
        this.ranking = builder.ranking;
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

    public static final class Builder extends User.Builder {
        @NotNull
        String ranking;

        public Builder(@NotNull String userName, @NotNull Date birthDate) {
            super(userName, birthDate);
            ranking = "";
        }

        public Builder setRanking(@NotNull String ranking) {
            this.ranking = ranking;
            return this;
        }

        @Override
        public Teacher build() {
            if (id == null)
                id = ++co;
            return new Teacher(this);
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
