package Entities;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class School {
    public String name;
    public String address;
    private List<Employee> employees;
    private List<Student> students;
    double bankBalance;

    public School(String name, String address, double bankBalance) {
        this.name = name;
        this.address = address;
        this.bankBalance = bankBalance;
        employees = new ArrayList<>();
        students = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Student> getStudents() {
        return students;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void addStudent(Student student){
        students.add(student);
    }


    /**
     * @param moneyIn - amount of money which will be added to school bank balance.
     */
    public void receiveMoney(double moneyIn){
        bankBalance += moneyIn;
    }

    /**
     * Calculate amount of salary that's need to be paid
     * and subtract the amount from school bank balance.
     */
    public void paySalary(){
        double salaryToPay = 0;
        for (Employee employee : employees) {
            salaryToPay += employee.getSalary();
        }
        bankBalance -= salaryToPay;
        System.out.println("Employees salary paid. Total money paid: " + salaryToPay + " remaining bank balance: " + getBankBalance());
    }

    /**
     * @param expense - additional expense to pay for school (different from salary)
     */
    public void payAdditionalExpenses(double expense){
        bankBalance -= expense;
    }

    @Override
    public String toString() {
        return getName() + " on " + getAddress() + " street";
    }
}
