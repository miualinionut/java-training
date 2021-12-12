package clean.code.design_patterns.requirements.platform.pojo;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public final class Quiz {
    final int id;
    @NotNull
    final Course course;
    @NotNull
    String quiz;

    public Quiz(@NotNull Builder builder) {
        this.id=builder.id;
        this.course = builder.course;
        this.quiz = builder.quiz;
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

    public static final class Builder {
        private Integer id;
        @NotNull
        private final Course course;
        String quiz;
        private static int co = 0;

        public Builder(@NotNull Course course) {
            this.course = course;
        }

        public Builder setId(int id) {
            this.id = id;
            if (id > co)
                co = id;
            return this;
        }

        public Builder setQuizContent(@NotNull String quiz) throws IllegalArgumentException {
            if (quiz.length() == 0)
                throw new IllegalArgumentException("Quiz must not be empty");
            this.quiz = quiz;
            return this;
        }

        public Quiz build() throws IllegalArgumentException{
            if(quiz==null || quiz.length()==0)
                throw new IllegalArgumentException("Quiz must be set");
            if(id==null)
                id=++co;
            return new Quiz(this);
        }
    }
}
