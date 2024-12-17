import java.time.LocalDate;

public class Developer extends Person{

    private String projectName;


    public Developer() {}

    public Developer(String name, String email, String phoneNumber, String address, LocalDate dateOfBirth, int salary, String projectName) {
        super(name, email, phoneNumber, address, dateOfBirth, salary);
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", projectName='" + projectName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }


    @Override
    public double bounceSalary(){
        return salary * 0.10;
    }


}



