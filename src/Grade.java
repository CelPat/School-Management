public class Grade {
    private int id;
    private Grade grade;
    private Subject subject;
    private String description;

    private int grades_count = 0;
    public Grade(Grade grade, Subject subject, String description) {
        this.id = grades_count;
        this.grade = grade;
        this.subject = subject;
        this.description = description;
        grades_count++;
    }

}
