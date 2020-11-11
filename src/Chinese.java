public class Chinese extends MenuItem{

    //pass data to MenuItem
    public Chinese(String name, int price, int available) {
        super(name, price, available, "Chinese");
    }

    //show this lunch set data
    public String ShowMenu() {
        String show = "Chinese style Business Set Lunch";
        show += "\nmain dish : " + getName();
        show += "\nwith rice, Chinese soup, Chinese tea";
        show += "\nprice : " + getPrice();
        show += "\navailable count : " + getAvailable();
        return show;
    }
}
