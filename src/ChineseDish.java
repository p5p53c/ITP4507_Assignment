import java.util.Scanner;

public class ChineseDish implements Dish {
    private String name;
    public static Scanner scanner = new Scanner(System.in);
    public ChineseDish() {
    }

    @Override
    public MenuItem create() {
        int price, available;

        System.out.print("Enter main dish : ");
        name = scanner.nextLine();
        System.out.print("Enter price : ");
        price = scanner.nextInt();
        System.out.print("Enter available count : ");
        available = scanner.nextInt();

        MenuItem item = new Chinese(name, price, available);
        scanner.reset();
        return item;
    }
}
