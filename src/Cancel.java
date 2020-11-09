import java.util.Scanner;

public class Cancel implements Menu {
    public Cancel() {
        Scanner scanner = new Scanner(System.in);
        int staff;
        System.out.print("Staff Number");
        staff = scanner.nextInt();
        for (int i = 0; i < list.orderList.size(); i++) {
            if (staff == list.orderList.get(i).getStaff()) {
                System.out.println(list.orderList.get(i).ShowOrder());
            }
        }
    }
}
