import java.time.LocalDate;
import java.util.Date;

public class Project {

    private String name;
    private Developer headDeveloper;

    private LocalDate startingDate;
    private LocalDate endingDate;


    Project(){}

    public Project(String name, Developer headDeveloper, LocalDate startingDate, LocalDate endingDate) {
        this.name = name;
        this.headDeveloper = headDeveloper;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Developer getHeadDeveloper() {
        return headDeveloper;
    }

    public void setHeadDeveloper(Developer headDeveloper) {
        this.headDeveloper = headDeveloper;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", headDeveloper=" + headDeveloper +
                ", startingDate=" + startingDate +
                ", endingDate=" + endingDate +
                '}';
    }
}
