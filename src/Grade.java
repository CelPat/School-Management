import java.time.temporal.TemporalAccessor;
import java.util.Objects;

public class Grade {
    private int id;
    private Student student;
    private PossibleGrade grade;
    private Subject subject;
    private String description;
    private static int grades_count = 0;
    public Grade(Student student, PossibleGrade grade, Subject subject, String description) {
        grades_count++;
        this.id = grades_count;
        this.student = student;
        this.grade = grade;
        this.subject = subject;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade1 = (Grade) o;
        return id == grade1.id && Objects.equals(student, grade1.student) && grade == grade1.grade && Objects.equals(subject, grade1.subject) && Objects.equals(description, grade1.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, student, grade, subject, description);
    }

    public int getId() {
        return id;
    }
    public Student getStudent() {
        return student;
    }
    public PossibleGrade getGrade() {
        return grade;
    }

    public Subject getSubject() {
        return subject;
    }

    public String getDescription() {
        return description;
    }

    public int getGrades_count() {
        return grades_count;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", grade=" + grade +
                ", description='" + description +
                ", subject=" + subject + '\'';
    }
}
