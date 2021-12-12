package clean.code.design_patterns.requirements.platform.pojo;

import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.Objects;

public final class UserCourseRepartition {
    @NotNull
    final Date startDate;
    @NotNull
    final Course course;
    @NotNull
    final User user;
    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public UserCourseRepartition(@NotNull Date startDate, @NotNull Course course, @NotNull User user) {
        this.startDate = startDate;
        this.course = course;
        this.user = user;
    }

    public @NotNull Date getStartDate() {
        return startDate;
    }

    public @NotNull Course getCourse() {
        return course;
    }

    public @NotNull User getUser() {
        return user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCourseRepartition that = (UserCourseRepartition) o;
        return startDate.equals(that.startDate) && course.equals(that.course) && user.equals(that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startDate, course, user);
    }

    @Override
    public String toString() {
        return "UserCourseRepartition{" +
                "course=" + course +
                ", startDate=" + simpleDateFormat.format(startDate) +
                ", user=" + user +
                '}';
    }

    public String toStringCsv() {
        return course.id + ", " + simpleDateFormat.format(startDate) + ", " + user.id;
    }
}
