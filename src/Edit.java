import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Edit implements Menu{
    public Edit() {
        Map style = new HashMap();
        Scanner scanner = new Scanner(System.in);
        style.put("c", "ChineseDish");
        style.put("w", "WesternDish");
        System.out.print("Chinese or Western (c | w) : ");
        try {
            String input = scanner.nextLine();
            Dish dish = (Dish) Class.forName((String)style.get(input.toLowerCase())).newInstance();
            MenuItem item = dish.create();
            list.menuList.add(item);
            System.out.println("Menu Updated\n");
        } catch (Exception e) {
            System.out.println("Incorrect command");
        }
    }
}
