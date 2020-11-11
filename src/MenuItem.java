public class MenuItem{
    //declaring variables
    private String name, style;
    private int available, price;

    //Constructor
    public MenuItem(String name, int price, int available, String style) {
        this.name = name;
        this.available = available;
        this.price = price;
        this.style = style;
    }

    //getter & setter start
    public String getStyle() {
        return style;
    }

    public String getName() {
        return name;
    }

    public int getAvailable() {
        return available;
    }

    public int getPrice() {
        return price;
    }
    //getter & setter end

    //increase available value
    public void add(int n) {
        available += n;
    }

    //decrease available value
    public void minus(int n) {
        available -= n;
    }

    //show the lunch set data
    public String ShowMenu() {
        return null;
    }
}
