import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {





        Company company = new Company("WM",new ArrayList<>(),"Bab toma");
        Company company2 = new Company("WM",new ArrayList<>(),"Bab toma");

        System.out.println(company2);
        System.out.println(company);
        if(company.equals(company2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


        company.addProject();


        Developer d1 = new Developer();
        Developer d2 = new Developer();
        Developer d3 = new Developer();


        company.getProjects().get(0).setHeadDeveloper(d1);



    }
}