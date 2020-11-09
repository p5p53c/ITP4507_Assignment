import java.util.Vector;

public class Memento {
    private MenuList menusList;
    private Vector<MenuItem> itemList = new Vector<MenuItem>();
    private Vector<MenuOrder> orderlist = new Vector<MenuOrder>();
    private int staff;

    public Memento() {}

    public Memento(MenuList ml, int staff) {
        this.staff = staff;
        menusList = ml;
        for (int i = 0; i < ml.menuList.size(); i++) {
            try {
                itemList.add((MenuItem) ml.menuList.get(i).clone());
                orderlist.add((MenuOrder) ml.orderList.get(i).clone());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public MenuList getDishlist() {
        return menusList;
    }

    public void restore() {
        menusList.menuList = this.itemList;
        menusList.orderList = this.orderlist;
    }

    public int getStaff() { return staff; }
}
