public class MenuOrder implements Cloneable {
    private String name, drink;
    private int staff, locat;

    public MenuOrder(String name, String drink, int staff, int locat) {
        this.name = name;
        this.drink = drink;
        this.staff = staff;
        this.locat = locat;
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

    public String ShowOrder() {
        return null;
    }

    public Object clone() throws CloneNotSupportedException  {
        return super.clone();
    }
}
