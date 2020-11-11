import java.util.Scanner;

public class ChineseDish implements Dish {
    public Scanner scanner = new Scanner(System.in);
    //empty Constructor
    public ChineseDish() {
    }

    @Override
    public MenuItem create() {
        //declaring variables
        String name;
        int price, available;

        //ask user main dish name
        System.out.print("Enter main dish : ");
        name = scanner.nextLine();
        //ask user lunch set price
        System.out.print("Enter price : ");
        price = scanner.nextInt();
        //ask user how many lunch set
        System.out.print("Enter available count : ");
        available = scanner.nextInt();

        //pass data to Chinese
        MenuItem item = new Chinese(name, price, available);
        //go back Edit
        return item;
    }
}
