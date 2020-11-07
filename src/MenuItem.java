public class MenuItem implements Cloneable {
    private String name, style;
    private int available, price;

    public MenuItem(String name, int price, int available, String style) {
        this.name = name;
        this.available = available;
        this.price = price;
        this.style = style;
    }

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

    public void add(int n) {
        available += n;
    }

    public void minus(int n) {
        available -= n;
    }

    public String ShowMenu() {
        return null;
    }

    public Object clone() throws CloneNotSupportedException  {
        return super.clone();
    }
}
