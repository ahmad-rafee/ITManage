import java.util.Scanner;

public class App {
    static Scanner scanner;

    // tasks to be done
    /*
     * 1- Add just one Manager
     * 2- Create Arraylist of Engineers
     * 3- Create Arraylist of Customers
     * 4- Create Arraylist of Projects
     * 5- display main menu
     */
    public static void main(String[] args) throws Exception {
        scanner = new Scanner(System.in);
        System.out.println("Hello, World!");
    }

    public static void displayMainMenu() {
        // here we are going to display the choices the user should choose.
        // example of adding an employee ..
        renderAddEmployeeMenu();
    }

    public static void renderAddEmployeeMenu() {
        // is it good to write the screen here ?
        // or call it from the Employee class ?
        String text = "\n1- Add Employee:";
        text += "\n\t 1- Add Manager";
        text += "\n\t 2- Add Engineer";
        text += "\n\t 3- Back to Main menu";
        System.out.println(text);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                // ask for manager data ..
                // better call the entire screen from the manager class ?
                // or just write it here ?
                /*
                name = scanner.nextString();
                address = scanner.nextString();
                mobile = scanner.nextString();
                Manager maganer = new Manager( name,address,mobile, ...);
                    OR
                Manager.renderAddManagerScreen();
                 */
                
                break;
            case 2:
                // ask for engineer data ..
                break;
            case 3:
                break;
            default:
                // if the user didnt choose anything, just repeat
                renderAddEmployeeMenu();
        }
        /*
          here,
            better write the method as this or leave this task to the Employee class ?
        example:
            Employee.renderAddMenu();
            and the renderAddMenu in Employee class will take care of getting input from the user and handling it ..
            if yes,
            should we write the method with no parameters ? or we should add some ?
            again, if yes , what parameters ?
         */

    }
}
