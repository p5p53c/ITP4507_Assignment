import java.util.Scanner;

public class Cancel implements Menu {
    public static Scanner scanner = new Scanner(System.in);
    private int staff;
    private String style;

    public Cancel() {
        System.out.println("Cancel Order");
        System.out.print("Staff Number");
        staff = scanner.nextInt();
        for (int i = 0; i <= list.orderList.size(); i++) {
            if (staff == list.orderList.get(i).getStaff()) {
                System.out.println(list.orderList.get(i).ShowOrder());
                style = list.orderList.get(i).getStyle();
                list.orderList.remove(i);
                break;
            }
        }
        for (int i = 0; i <= list.menuList.size(); i++) {
            if (style.equals(list.menuList.get(i).getStyle())) {
                list.menuList.get(i).add(1);
                break;
            }
        }
        System.out.println("Order Cancelled\n");
    }
}
