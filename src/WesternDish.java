import java.util.Scanner;

public class WesternDish implements Dish {
    public Scanner scanner = new Scanner(System.in);//Scanner
    //empty Constructor
    public WesternDish() {
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

        //pass data to Western
        MenuItem item = new Western(name, price, available);
        //go back Edit
        return item;
    }
}
