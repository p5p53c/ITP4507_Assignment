import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Edit implements Menu{
    public Edit() {
        
    }

    public void execute() {
        //declaring variables
        Scanner scanner = new Scanner(System.in);//Scanner
        //setup command
        Map style = new HashMap();
        style.put("c", "ChineseDish");
        style.put("w", "WesternDish");

        //run the edit process
        System.out.println("Edit Menu");
        System.out.print("Chinese or Western (c | w) : ");
        try {
            String input = scanner.nextLine().toLowerCase();//read user input
            Dish dish = (Dish) Class.forName((String)style.get(input)).newInstance();//new a Dish
            MenuItem item = dish.create();//create a Dish

            //put a Dish into menu
            if (input.equals("c"))
                list.menuList[0] = item;
            else if (input.equals("w"))
                list.menuList[1] = item;

            System.out.println("Menu Updated\n");
        } catch (Exception e) {
            System.out.println("Incorrect Edit menu command");
        }
    }
}
