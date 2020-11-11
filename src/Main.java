import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declaring variables
        Scanner scanner = new Scanner(System.in); //Scanner
        String input;//store the user input
        boolean cont = true;//deside the program ends
        //setup command
        Map commandInput = new HashMap();
        commandInput.put("e", "Edit");
        commandInput.put("s", "Show");
        commandInput.put("p", "Place");
        commandInput.put("c", "Cancel");
        commandInput.put("l", "List");
        commandInput.put("d", "Done");

        //Run the main process
        while (cont) {
            //Instruct the user to enter command
            System.out.println("Please enter command: [e | s | p | c | l | d | q]");
            System.out.println("e = Edit menu, s = Show menu, p = Place order, c = Cancel order,");
            System.out.println("l = List orders, d = order is Done, q = Quit");
            try {
                //read the user input
                input = scanner.nextLine().toLowerCase();
                System.out.println();
                //Exit the program when user input "q"
                if (input.equals("q")) {
                    cont = false;
                    continue;
                }
                //execute the user command
                Class.forName((String) commandInput.get(input)).newInstance();
            } catch (Exception e) {
                System.out.println("Incorrect Main menu command");
            }
        }
        //End the Program
        System.out.println("Thank you! Goodbye!");
    }
}
