package clean.code.design_patterns.requirements.platform.pojo;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public final class Course {
    final int id;
    @NotNull
    final User teacher;
    @NotNull
    final String courseName;
    @NotNull
    String description;
    private static int co = 0;

    public Course(@NotNull User teacher, @NotNull String courseName, @NotNull String description) {
        this.teacher = teacher;
        this.courseName = courseName;
        this.description = description;
        this.id = ++co;
    }

    public Course(int id, @NotNull User teacher, @NotNull String courseName, @NotNull String description) {
        this.teacher = teacher;
        this.courseName = courseName;
        this.description = description;
        this.id = id;
        if (id > co)
            co = id;
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
}
