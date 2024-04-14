package Entities;

import java.util.NoSuchElementException;

public class Teacher extends Employee{
    public Teacher(String firstName, String lastName, int age, double salary) {
        super(firstName, lastName, age, salary, Position.TEACHER);
    }


    /**
     * @param student - student who got a grade
     * @param grade - grade form possible grades
     * @param subject - subject from which student got a grade
     * @param description - description of a grade
     */
    public void createAndAddGradeForStudent(Student student, PossibleGrade grade, Subject subject, String description){
        Grade newGrade = new Grade(student,grade,subject, description);
        student.grades.add(newGrade);
    }

    /**
     * @param student - student who grade teacher wants to change
     * @param idOfGradeToChange - id of the grade to change
     * @param newGrade - new grade which will replace old grade
     * @return true if grade was found and changed / false if grade was not found.
     */
    public boolean changeGrade(Student student, int idOfGradeToChange, Grade newGrade){
        for (Grade grade : student.grades) {
            try{
                if(grade.getId() == idOfGradeToChange){
                    grade = newGrade;
                    removeGrade(student,idOfGradeToChange);
                    addGrade(student,newGrade);
                    System.out.println("Entities.Grade changed.");
                    System.out.println("New grade: " + grade);
                    return true;
                }
            }catch (NoSuchElementException e){
                System.err.println("Entities.Grade not found");
            }
        }
        System.err.println();
        return false;
    }

    public void addGrade(Student student, Grade gradeToAdd){
        student.grades.add(gradeToAdd);
        System.out.println("Dodadno ocene: " + gradeToAdd);
    }

    public boolean removeGrade(Student student, int idOfGradeToRemove){
        for(Grade grade : student.grades){
            try{
                if(grade.getId() == idOfGradeToRemove){
                    student.grades.remove(grade);
                    System.out.println("Entities.Grade removed");
                    return true;
                }
            }catch (NoSuchElementException e){
                System.err.println("Entities.Grade not found");
            }
        }
        return false;
    }

}
