import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Place implements Menu {
    public Place() {
        
    }
    public void execute() {
        //declaring variables
        Scanner scanner = new Scanner(System.in);
        String stylename, dishname = "";
        int available = 0;
        //setup command
        Map style = new HashMap();
        style.put("c", "Chinese");
        style.put("w", "Western");

        //run the main process
        System.out.println("Place Order");
        System.out.print("Chinese or Western (c | w) : ");
        try {
            //read user input
            String input = scanner.nextLine().toLowerCase();
            stylename = (String)style.get(input);
            int i;
            //get the user selected dish data
            for (i = 0; i < list.menuList.length; i++) {
                if (stylename.equals(list.menuList[i].getStyle())) {
                    dishname = list.menuList[i].getName();
                    available = list.menuList[i].getAvailable();
                    break;
                }
            }
            //check dish is it available
            if (available <= 0) {
                System.out.println("Sold Out!\n ");
                return;
            }

            //call Order
            stylename += "Order";
            Order order = (Order) Class.forName(stylename).newInstance();//new a Order
            MenuOrder place = order.order(dishname);//create a Order
            list.orderList.add(place);//add Order to OrderList
            list.menuList[i].minus(1);//reduce remaining quantity
            ct.saveAction(list);//backup the status
            System.out.println("Order Placed\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
