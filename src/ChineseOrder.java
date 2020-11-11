import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChineseOrder implements Order {
    private String name;
    public Scanner scanner = new Scanner(System.in);

    public ChineseOrder() {}

    @Override
    public MenuOrder order(String name) {
        this.name = name;
        String drink;
        int staff, locat;
        Map drinkInput = new HashMap();
        drinkInput.put("h", "Hot Tea");
        drinkInput.put("i", "Iced Tea");

        System.out.print("Oolong Tea : hot or iced (h | i) : ");
        drink = (String)drinkInput.get(scanner.nextLine().toLowerCase());
        System.out.print("Staff Number : ");
        staff = scanner.nextInt();
        System.out.print("Office Location : ");
        locat = scanner.nextInt();

        MenuOrder order = new ChineseO(name, drink, staff, locat);
        scanner.reset();
        return order;
    }
}
