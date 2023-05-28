import java.util.ArrayList;
import java.util.List;

public class Engineer extends Employee {
    String department;
    List<Project> projects; // is having a list better or just a counter ?
    public Engineer(){
        // add more constructor to initialize Engineer data ...
        // initializing the projects list ..
        this.projects = Project.getEngineerProjects(this.getId());
    }
    public Engineer(ArrayList<Project> projects){
        this.projects= projects;
        // sometimes projects can be stored in a file .. 
    }
    // to be done ... addProject, removeProject
}
