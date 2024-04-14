package Controllers;
import Entities.*;
public final class SchoolControler {
    public static void createSchool(String name, String address, double bankBalance){
        new School(name, address, bankBalance);
    }

    public static void addEmployeeToSchool(School school, Employee employee) {
        school.addEmployee(employee);
    }

    public static void addStudentToSchool(School school, Student student){
        school.addStudent(student);
    }

}
