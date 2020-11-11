public class MenuOrder{
    private String name, drink, style;
    private int staff, locat;

    public MenuOrder(String name, String drink, int staff, int locat, String style) {
        this.name = name;
        this.drink = drink;
        this.staff = staff;
        this.locat = locat;
        this.style = style;
    }

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

    public String ShowOrder() {
        return null;
    }
}
