public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private Position position;
    private double salary;

    public Employee(String firstName, String lastName, int age, double salary, Position position) {
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

    public Position getPosition() {
        return position;
    }

    /**
     * @param position - Change current position to new one provided as param.
     */
    public void changePosition(Position position){
        this.position = position;
    }


    @Override
    public String toString() {
        return getFirstName() + ' ' +
                "Age: " + getAge() + ' ' +
                "Position: " + getPosition() + ' ' +
                "Salary: " + getSalary();
    }
}
