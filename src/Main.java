import Entities.*;
import View.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final int EXIT = 0;
        final int CREATE_EMPLOYEE = 1;
        final int CREATE_STUDENT = 2;

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                 | UnsupportedLookAndFeelException e1) {
            e1.printStackTrace();
        }
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    MainFrame frame = new MainFrame();
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });

/*
        System.out.println("Create school first.");
        System.out.println("Enter name of the school:");
        String name = input.nextLine();
        System.out.println("Enter address of the school:");
        String address = input.nextLine();
        System.out.println("Enter school budget");
        double bankBalance = input.nextDouble();

        School school1 = new School(name,address,bankBalance);

        do {
            System.out.println("Options:" +
                    "Quit - " + EXIT +
                    "Create employee - " + CREATE_EMPLOYEE +
                    "Create Entities.Student - " + CREATE_STUDENT);
            int choice = input.nextInt();
            try{
                if(choice == CREATE_EMPLOYEE){
                    createEmployee(input);
                }
            }catch (NoSuchElementException e){
                System.err.println("Try again");
            }


        }while (input.nextInt() != (EXIT));



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
*/

    }





}