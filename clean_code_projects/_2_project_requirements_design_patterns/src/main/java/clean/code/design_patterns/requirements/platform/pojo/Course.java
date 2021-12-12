package clean.code.design_patterns.requirements.platform.pojo;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public final class Course {
    final int id;
    @NotNull
    final Teacher teacher;
    @NotNull
    final String courseName;
    @NotNull
    String description;

    public Course(@NotNull Builder builder) {
        this.id = builder.id;
        this.teacher = builder.teacher;
        this.courseName = builder.courseName;
        this.description = builder.description;
    }

    public @NotNull String getDescription() {
        return description;
    }

    public void setDescription(@NotNull String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", teacher=" + teacher +
                ", courseName='" + courseName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id && teacher.equals(course.teacher) && courseName.equals(course.courseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, teacher, courseName);
    }

    public @NotNull User getTeacher() {
        return teacher;
    }

    public int getId() {
        return id;
    }

    public @NotNull String getCourseName() {
        return courseName;
    }

    public String toStringCsv() {
        return id + ", " + teacher.id + ", " + courseName + ", " + description;
    }

    public static final class Builder {
        private Integer id;
        @NotNull
        private final Teacher teacher;
        private String courseName;
        @NotNull
        private String description;
        private static int co = 0;

        public Builder(@NotNull Teacher teacher) {
            this.teacher = teacher;
            this.description = "";
        }

        public Builder setId(int id) {
            this.id = id;
            if (id > co)
                co = id;
            return this;
        }

        public Builder setCourseName(@NotNull String courseName) throws IllegalArgumentException {
            if (courseName.length() == 0)
                throw new IllegalArgumentException("Course name cannot be empty");
            this.courseName = courseName;
            return this;
        }

        public Builder setDescription(@NotNull String description) {
            this.description = description;
            return this;
        }

        public Course build() throws IllegalArgumentException {
            if (courseName == null || courseName.length() == 0)
                throw new IllegalArgumentException("Course name must be set");
            if (id == null)
                id = ++co;
            return new Course(this);
        }
    }
}
