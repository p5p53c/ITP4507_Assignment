public class WesternO extends MenuOrder {
    //declaring variables
    private String side;

    //pass data to MenuOrder
    public WesternO(String name, String drink, int staff, int locat, String side) {
        super(name, drink, staff, locat, "Western");
        this.side = side;
    }

    //getter
    public String getSide() {
        return side;
    }

    //show this order data
    @Override
    public String ShowOrder() {
        String show = "W : " + getStaff() + ", ";
        show += getLocat() + ", ";
        show += getName() + ", ";
        show += getSide() + ", ";
        show += "Western Soup, ";
        show += getDrink();
        return show;
    }
}
