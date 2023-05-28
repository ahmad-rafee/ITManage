import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    List<Project> projects; // is having a list better or just a counter ?

    public Customer(){
        // add more constructor to initialize the customer with person data
        // initializing the list ...
        this.projects = Project.getCustomerProjects(this.getId());
    }
    public Customer(List<Project> projects){
        // sometimes projects can be stored in a file ..
        this.projects=projects;
    }

}
