import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Place implements Menu {
    public Place() {
        Scanner scanner = new Scanner(System.in);
        String stylename, dishname = "";
        int available = 0;
        Map style = new HashMap();
        style.put("c", "Chinese");
        style.put("w", "Western");

        System.out.print("Chinese or Western (c | w) : ");
        try {
            String input = scanner.nextLine();
            stylename = (String)style.get(input.toLowerCase());
            int i;
            for (i = 0; i < list.menuList.size(); i++) {
                if (stylename.equals(list.menuList.get(i).getStyle())) {
                    dishname = list.menuList.get(i).getName();
                    available = list.menuList.get(i).getAvailable();
                    break;
                }
            }
            if (available <= 0) {
                System.out.println("Sold Out!\n ");
                return;
            }
            stylename += "Order";
            Order order = (Order) Class.forName(stylename).newInstance();
            MenuOrder place = order.order(dishname);
            un.saveaction(list, "Edit" + place.getName());
            list.orderList.add(place);
            list.menuList.get(i).minus(1);
            System.out.println("Order Placed\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
