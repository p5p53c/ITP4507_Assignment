import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChineseOrder implements Order {
    public Scanner scanner = new Scanner(System.in);

    //empty Constructor
    public ChineseOrder() {}

    @Override
    public MenuOrder order(String name) {
        //declaring variables
        String drink;
        int staff, locat;
        //setup command
        Map drinkInput = new HashMap();
        drinkInput.put("h", "Hot Tea");
        drinkInput.put("i", "Iced Tea");

        //ask user want hot or iced drink
        System.out.print("Oolong Tea : hot or iced (h | i) : ");
        drink = (String)drinkInput.get(scanner.nextLine().toLowerCase());
        //ask staff number
        System.out.print("Staff Number : ");
        staff = scanner.nextInt();
        //ask where is this order
        System.out.print("Office Location : ");
        locat = scanner.nextInt();

        //pass data to ChineseO
        MenuOrder order = new ChineseO(name, drink, staff, locat);
        //go back to Order
        return order;
    }
}
