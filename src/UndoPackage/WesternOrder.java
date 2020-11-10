package UndoPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WesternOrder implements Order {
    private String name;
    public Scanner scanner = new Scanner(System.in);

    public WesternOrder() {
    }

    @Override
    public MenuOrder order(String name) {
        this.name = name;
        String drink, side;
        int staff, locat;

        Map drinkInput = new HashMap();
        drinkInput.put("ht", "Hot Tea");
        drinkInput.put("it", "Iced Tea");
        drinkInput.put("hc", "Hot Coffee");
        drinkInput.put("ic", "Iced Coffee");

        Map sideInput = new HashMap();
        sideInput.put("r", "Rice");
        sideInput.put("s", "Spaghetti");
        sideInput.put("f", "French fries");

        System.out.print("side : Rice, Spaghetti, French fries (r | s | f) : ");
        side = (String)sideInput.get(scanner.nextLine());
        System.out.print("tea or coffee, hot or iced (ht| it | hc | ic):");
        drink = (String)drinkInput.get(scanner.nextLine());
        System.out.print("Staff Number : ");
        staff = scanner.nextInt();
        System.out.print("Office Location : ");
        locat = scanner.nextInt();

        MenuOrder order = new WesternO(name, drink, staff, locat, side);
        scanner.reset();
        return order;
    }
}
