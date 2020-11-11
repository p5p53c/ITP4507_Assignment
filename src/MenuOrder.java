public class MenuOrder{
    //declaring variables
    private String name, drink, style;
    private int staff, locat;

    //Constructor
    public MenuOrder(String name, String drink, int staff, int locat, String style) {
        this.name = name;
        this.drink = drink;
        this.staff = staff;
        this.locat = locat;
        this.style = style;
    }

    //getter start
    public String getName() {
        return name;
    }

    public String getDrink() {
        return drink;
    }

    public int getStaff() {
        return staff;
    }

    public int getLocat() {
        return locat;
    }

    public String getStyle() {
        return style;
    }
    //getter end

    //show the order data
    public String ShowOrder() {
        return null;
    }
}
