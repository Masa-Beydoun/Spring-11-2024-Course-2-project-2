import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Project> projects;
    private String address;

    public Company(String name, ArrayList<Project> projects, String address) {
        this.name = name;
        this.projects = projects;
        this.address = address;
    }
    public Company(String name, String address) {
        this.name = name;
        this.address = address;
        projects = new ArrayList<>();
    }

    public void addProject(){
        Project project = new Project();
        projects.add(project);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;
        return name.equals(company.name) && projects.equals(company.projects) && address.equals(company.address);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + projects.hashCode();
        result = 31 * result + address.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", projects=" + projects +
                ", address='" + address + '\'' +
                '}';
    }
}
