import java.util.Vector;

public class Memento {
    private MenuList dishlist;
    private Vector<MenuItem> itemList = new Vector<MenuItem>();
    private String name;

    public Memento() {}

    public Memento(MenuList me, String name) {
        this.name = name;
        dishlist = me;
        for (int i = 0; i < me.menuList.size(); i++) {
            try {
                itemList.add((MenuItem) me.menuList.get(i).clone());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public MenuList getDishlist() {
        return dishlist;
    }

    public void restore() {
        dishlist.menuList = this.itemList;
    }

    @Override
    public String toString() {
        return name;
    }
}
