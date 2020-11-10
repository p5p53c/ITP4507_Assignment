package UndoPackage;

public class WesternO extends MenuOrder {
    private String side;

    public WesternO(String name, String drink, int staff, int locat, String side) {
        super(name, drink, staff, locat);
        this.side = side;
    }

    public String getSide() {
        return side;
    }

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
