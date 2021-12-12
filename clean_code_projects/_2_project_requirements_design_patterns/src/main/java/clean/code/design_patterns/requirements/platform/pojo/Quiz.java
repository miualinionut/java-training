package clean.code.design_patterns.requirements.platform.pojo;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public final class Quiz {
    final int id;
    @NotNull
    final Course course;
    @NotNull
    String quiz;
    private static int co = 0;

    public Quiz(@NotNull Course course, @NotNull String quiz) {
        this.course = course;
        this.quiz = quiz;
        this.id = ++co;
    }

    public Quiz(int id, @NotNull Course course, @NotNull String quiz) {
        this.course = course;
        this.quiz = quiz;
        this.id = id;
        if (id > co)
            co = id;
    }

    public @NotNull Course getCourse() {
        return course;
    }

    public @NotNull String getQuiz() {
        return quiz;
    }

    public int getId() {
        return id;
    }

    public void setQuiz(@NotNull String quiz) {
        this.quiz = quiz;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "id=" + id +
                ", course=" + course +
                ", quiz='" + quiz + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quiz quiz1 = (Quiz) o;
        return id == quiz1.id && course.equals(quiz1.course) && quiz.equals(quiz1.quiz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, course, quiz);
    }

    public String toStringCsv() {
        return id + ", " + course.id + ", " + quiz;
    }
}
