import java.util.Scanner;

public class WesternDish implements Dish {
    public WesternDish() {
    }

    @Override
    public MenuItem create() {
        String name;
        int price, available;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter main dish : ");
        name = scanner.nextLine();
        System.out.print("Enter price : ");
        price = scanner.nextInt();
        System.out.print("Enter available count : ");
        available = scanner.nextInt();

        MenuItem item = new Western(name, price, available);
        return item;
    }
}
