import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Edit implements Menu{
    public Edit() {
        Scanner scanner = new Scanner(System.in);
        Map style = new HashMap();
        style.put("c", "ChineseDish");
        style.put("w", "WesternDish");
        System.out.println("Edit Menu");
        System.out.print("Chinese or Western (c | w) : ");
        try {
            String input = scanner.nextLine().toLowerCase();
            Dish dish = (Dish) Class.forName((String)style.get(input)).newInstance();
            MenuItem item = dish.create();
            if (input.equals("c"))
                list.menuList[0] = item;
            else if (input.equals("w"))
                list.menuList[1] = item;
            System.out.println("Menu Updated\n");
        } catch (Exception e) {
            System.out.println("Incorrect command");
        }
    }
}
