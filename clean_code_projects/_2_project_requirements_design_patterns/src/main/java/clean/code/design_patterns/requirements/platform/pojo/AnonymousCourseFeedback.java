package clean.code.design_patterns.requirements.platform.pojo;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public final class AnonymousCourseFeedback {
    final int id;
    @NotNull
    final Course course;
    @NotNull
    final String feedback;
    private static int co = 0;

    public AnonymousCourseFeedback(@NotNull Course course, @NotNull String feedback) {
        this.course = course;
        this.feedback = feedback;
        this.id = ++co;
    }

    public AnonymousCourseFeedback(int id, @NotNull Course course, @NotNull String feedback) {
        this.course = course;
        this.feedback = feedback;
        this.id = id;
        if (id > co)
            co = id;
    }

    public @NotNull Course getCourse() {
        return course;
    }

    public @NotNull String getFeedback() {
        return feedback;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnonymousCourseFeedback feedback1 = (AnonymousCourseFeedback) o;
        return id == feedback1.id && course.equals(feedback1.course) && feedback.equals(feedback1.feedback);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, course, feedback);
    }

    @Override
    public String toString() {
        return "AnonymousCourseFeedback{" +
                "id=" + id +
                ", course=" + course +
                ", feedback='" + feedback + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String toStringCsv() {
        return id + ", " + course.id + ", " + feedback;
    }
}
