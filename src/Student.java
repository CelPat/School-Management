import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private int semester;
    private List<Subject> subjects;

    public Student(String firstName, String lastName, int age, int semester) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.semester = semester;
    }

    /*
    Return student last name.
    @return String
     */
    public String getFirstName() {
        return firstName;
    }

    /*
    Return student fist name.
    @return String
     */
    public String getLastName() {
        return lastName;
    }

    /*
    Return student current age.
    @return int
     */
    public int getAge() {
        return age;
    }

    /*
    Return student current semester.
    @return int
     */
    public int getSemester() {
        return semester;
    }

    /*
    Returns list of subjects that student is currently enrolled to.
    @return List<Subject>
     */
    public List<Subject> getSubjects() {
        return subjects;
    }

    /*
    Adds the subject to student's list of subjects
    @param subject - subject to add to the list
     */
    public void addSubject(Subject subject){
        subjects.add(subject);
    }

    /*
    Remove given subject from student's list of subjects.
    @param subjectToRemove - subject to remove from the list
    */
    public void removeSubject(Subject subjectToRemove){
        for (Subject subject : subjects) {
            if (subject == subjectToRemove){
                subjects.remove(subject);
            }
        }
    }

    /*
    Gives back all info about the student.
    @return String - String of students data.
     */
    @Override
    public String toString() {
        return getFirstName() + ' ' +
                getFirstName() + ' ' +
                "Age: " + getAge() + ' ' +
                "Semester: " + getSemester() + ' ' +
                "Subjects: " + getSubjects();
    }
}
