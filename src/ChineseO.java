public class ChineseO extends MenuOrder {

    //pass data to MenuOrder
    public ChineseO(String name, String drink, int staff, int locat) {
        super(name, drink, staff, locat, "Chinese");
    }

    //show this order data
    @Override
    public String ShowOrder() {
        String show = "C : " + getStaff() + ", ";
        show += getLocat() + ", ";
        show += getName() + ", ";
        show += "Chinese Soup, ";
        show += getDrink();
        return show;
    }
}
