package Entities;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private int semester;
    private List<Subject> subjects;
    protected List<Grade> grades;

    public Student(String firstName, String lastName, int age, int semester) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.semester = semester;
        subjects = new ArrayList<>();
        grades = new LinkedList<>();
    }

    /**
     * @return String - student's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return String - student last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return int - student current age.
     */
    public int getAge() {
        return age;
    }

    /**
     * @return int - student current semester
     */
    public int getSemester() {
        return semester;
    }

    /**
     * @return List<Entities.Subject> - list of subjects that student is currently enrolled to.
     */
    public List<Subject> getSubjects() {
        return subjects;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    /**
     * Adds the subject to student's list of subjects
     * @param subject - subject to add to the list
     */
    public void addSubject(Subject subject){
        subjects.add(subject);
    }

    /**
     *  Remove given subject from student's list of subjects.
     * @param subjectToRemove - subject to remove from the list of subjects.
     */
    public void removeSubject(Subject subjectToRemove){
        subjects.removeIf(subject -> subject == subjectToRemove);
    }

    /**
     * Removes all subject from student list of subject.
     * Should be used when student is starting next semester and subjects are changing.
     *
     */
    public void removeAllSubjects(){
        subjects.clear();
    }

    /**
     * Gives back all info about the student.
     * @return String - String of students data.
     */
    @Override
    public String toString() {
        return getFirstName() + ' ' +
                "Age: " + getAge() + ' ' +
                "Semester: " + getSemester() + ' ' +
                "Subjects: " + getSubjects();
    }
}
