import java.util.LinkedList;
import java.util.List;

public class Subject {

    private String name;
    private Employee teacher;

    public Subject(String name, Employee teacher) {
        this.name = name;
        this.teacher = teacher;
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

    @Override
    public String toString() {
        return name + '\'' + ", teacher - " + teacher;
    }
}
