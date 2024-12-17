import java.time.LocalDate;

public class Employee extends Person{


    public Employee() {
    }

    public Employee(String name, String email, String phoneNumber, String address, LocalDate dateOfBirth, int salary) {
        super(name, email, phoneNumber, address, dateOfBirth, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public double bounceSalary(){
        return salary * 0.05;
    }



}
