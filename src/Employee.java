public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String position;
    private double salary;

    public Employee(String firstName, String lastName, int age, double salary, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return getFirstName() + ' ' +
                getFirstName() + ' ' +
                "Age: " + getAge() + ' ' +
                "Position: " + getPosition() + ' ' +
                "Salary: " + getSalary();
    }
}
