import java.util.LinkedList;
import java.util.List;

public class Subject {

    private String name;
    private Employee teacher;
    private static List<PossibleGrade> possibleGrades;

    public Subject(String name, Employee teacher) {
        this.name = name;
        this.teacher = teacher;
        possibleGrades = new LinkedList<>();
    }


    /**
     * @return name - name of the subject
     */
    public String getName() {
        return name;
    }

    /**
     * @return teacher - info about the teacher who teaches a given subject
     */
    public Employee getTeacher() {
        return teacher;
    }

    /**
     * @return grades - we access to specific subject through Student and get info about all grades in this subject.
     */
    public static List<PossibleGrade> getGrades() {
        return possibleGrades;
    }

    public void addGrade(PossibleGrade possibleGrade){
        possibleGrades.add(possibleGrade);
    }
}
