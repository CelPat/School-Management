import java.time.temporal.TemporalAccessor;

public class Grade {
    private int id;
    private Student student;
    private PossibleGrade grade;
    private Subject subject;
    private String description;
    private int grades_count = 0;
    public Grade(Student student, PossibleGrade grade, Subject subject, String description) {
        grades_count++;
        this.id = grades_count;
        this.student = student;
        this.grade = grade;
        this.subject = subject;
        this.description = description;
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
                ", subject=" + subject +
                ", description='" + description + '\'';
    }
}
