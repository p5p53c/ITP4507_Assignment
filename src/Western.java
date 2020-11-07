public class Western extends MenuItem {
    public Western(String name, int price, int available) {
        super(name, price, available, "Western");
    }

    @Override
    public String ShowMenu() {
        String show = "Western style Business Set Lunch";
        show += "\nmain dish : " + getName();
        show += "\nwith rice/spaghetti/French fries";
        show += "\nprice : " + getPrice();
        show += "\navailable count : " + getAvailable();
        return show;
    }
}
