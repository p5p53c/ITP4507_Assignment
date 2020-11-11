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

        System.out.println("Place Order");
        System.out.print("Chinese or Western (c | w) : ");
        try {
            String input = scanner.nextLine();
            stylename = (String)style.get(input.toLowerCase());
            int i;
            for (i = 0; i < list.menuList.length; i++) {
                if (stylename.equals(list.menuList[i].getStyle())) {
                    dishname = list.menuList[i].getName();
                    available = list.menuList[i].getAvailable();
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
            list.orderList.add(place);
            list.menuList[i].minus(1);
            ct.saveAction(list);
            System.out.println("Order Placed\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
