import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Project {
    Engineer engineer;
    Customer customer;
    // adding a static method to get all projects ...
    public static List<Project> projects;

    public static List<Project> getProjects() {
        // here we can init some dummy project set ..
        // for now lets keep it just an empty list 
        return new ArrayList<Project>();
    }

    public static List<Project> getEngineerProjects(int id) {
        // search for engineer projects .. 
        return Project.getProjects().stream().filter(x -> x.getEngineer().getId() == id).collect(Collectors.toList());
    }
    
    public static List<Project> getCustomerProjects(int id) {
        // search for customer projects .. 
        return Project.getProjects().stream().filter(x -> x.getCustomer().getId() == id).collect(Collectors.toList());
    }
    public static void setProjects(ArrayList<Project> projects){
        // to update the projects list .....
        Project.projects=projects;
    }
    public Engineer getEngineer() {
        return engineer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setEngineer(Engineer engineer) {
        this.engineer = engineer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
