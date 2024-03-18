import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        School lo1 = new School("Liceum ogólnokształtcoce nr. 1", "3 maja", 40000);

        Teacher Liza = new Teacher("Liza", "Huberman", 24, 3800);
        Employee Adam = new Employee("Adam", "Goggins", 34, 4800,Position.DIRECTOR );
        Employee Mat = new Employee("Mat", "Smith", 41, 3100, Position.CARETAKER);
        Employee Sara = new Employee("Sara", "Tate", 25, 3450, Position.SECRETARY);


        addEmployeeToSchool(lo1, Liza);
        addEmployeeToSchool(lo1, Adam);
        addEmployeeToSchool(lo1, Mat);
        addEmployeeToSchool(lo1, Sara);

        System.out.println("Employees of " + lo1 + " " + lo1.getEmployees());


        Student s1 = new Student("Jan", "Kowalski", 13, 3);
        Student s2 = new Student("Maciek", "Mech", 12, 1);
        Student s3 = new Student("Wiktoria", "Majer", 13, 3);
        Student s4 = new Student("Piotrek", "Nowak", 14, 5);
        Student s5 = new Student("Michał", "Nowakowski", 13, 3);

        addStudentToSchool(lo1, s1);
        addStudentToSchool(lo1, s2);
        addStudentToSchool(lo1, s3);
        addStudentToSchool(lo1, s4);
        addStudentToSchool(lo1, s5);

        System.out.println("Students of " + lo1 + " " + lo1.getStudents());

        Subject math = new Subject("math", Liza);
        Liza.createAndAddGradeForStudent(s1, PossibleGrade.DB, math, "Test - geometry");

        System.out.println(s1.getGrades());

        Grade newGrade = new Grade(s1, PossibleGrade.BDB, math, "Retake - geometry");
        Liza.changeGrade(s1,1, newGrade);
        System.out.println(s1.getGrades());


    }


    private static void addEmployeeToSchool(School school, Employee employee) {
        school.addEmployee(employee);
    }

    private static void addStudentToSchool(School school, Student student){
        school.addStudent(student);
    }
}