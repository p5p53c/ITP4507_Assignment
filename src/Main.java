import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean cont = true;
        Map commandInput = new HashMap();
        commandInput.put("e", "Edit");
        commandInput.put("s", "Show");
        commandInput.put("p", "Place");
        commandInput.put("c", "Cancel");
        commandInput.put("l", "List");
        commandInput.put("d", "Done");
        while (cont) {
            System.out.println("Please enter command: [e | s | p | c | l | d | q]");
            System.out.println("e = Edit menu, s = Show menu, p = Place order, c = Cancel order,");
            System.out.println("l = List orders, d = order is Done, q = Quit");
            try {
                input = scanner.nextLine();
                if (input.toLowerCase().equals("q")) {
                    cont = false;
                    continue;
                }
                Class.forName((String) commandInput.get(input.toLowerCase())).newInstance();
            } catch (Exception e) {
                System.out.println("Incorrect command");
            }
        }
        System.out.println("Thank you! Goodbye!");
    }
}
