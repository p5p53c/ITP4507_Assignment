import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WesternOrder implements Order {
    public Scanner scanner = new Scanner(System.in);

    //empty Constructor
    public WesternOrder() {
    }

    @Override
    public MenuOrder order(String name) {
        //declaring variables
        String drink, side;
        int staff, locat;
        //setup drink command
        Map drinkInput = new HashMap();
        drinkInput.put("ht", "Hot Tea");
        drinkInput.put("it", "Iced Tea");
        drinkInput.put("hc", "Hot Coffee");
        drinkInput.put("ic", "Iced Coffee");

        //setup side command
        Map sideInput = new HashMap();
        sideInput.put("r", "Rice");
        sideInput.put("s", "Spaghetti");
        sideInput.put("f", "French fries");

        //ask user want which side
        System.out.print("side : Rice, Spaghetti, French fries (r | s | f) : ");
        side = (String)sideInput.get(scanner.nextLine().toLowerCase());
        //ask user want which drink
        System.out.print("tea or coffee, hot or iced (ht| it | hc | ic):");
        drink = (String)drinkInput.get(scanner.nextLine().toLowerCase());
        //ask staff number
        System.out.print("Staff Number : ");
        staff = scanner.nextInt();
        //ask where is this order
        System.out.print("Office Location : ");
        locat = scanner.nextInt();

        //pass data to WesternO
        MenuOrder order = new WesternO(name, drink, staff, locat, side);
        //go back to Order
        return order;
    }
}
