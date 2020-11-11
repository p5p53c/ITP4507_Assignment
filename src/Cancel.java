import java.util.Scanner;

public class Cancel implements Menu {
    public Scanner scanner = new Scanner(System.in);

    public Cancel() {
        //declaring variables
        int staff;
        //ask user want to cancel which order
        System.out.println("Cancel Order");
        System.out.print("Staff Number : ");
        staff = scanner.nextInt();
        //cancel the selected order
        ct.undo(staff);
        System.out.println("Order Cancelled\n");
    }
}
