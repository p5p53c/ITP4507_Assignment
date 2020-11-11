import java.util.Scanner;

public class Cancel implements Menu {
    public Scanner scanner = new Scanner(System.in);
    private int staff;
    private String style;

    public Cancel() {
        System.out.println("Cancel Order");
        System.out.print("Staff Number : ");
        staff = scanner.nextInt();
        ct.undo(staff);
        System.out.println("Order Cancelled\n");
    }
}
