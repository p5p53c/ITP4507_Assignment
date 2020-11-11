import java.util.Vector;

public class Memento {
    private MenuList list;
    private Vector<MenuOrder> orderList = new Vector<MenuOrder>();

    public Memento() {}

    public Memento(MenuList list) {
        this.list = list;
        for (int i = 0; i < list.orderList.size(); i++) {
            try {
                orderList.add(list.orderList.get(i));
            } catch (Exception e) {
                System.out.println("OrderList backup error");
                e.printStackTrace();
            }
        }
    }

    public void restore(int staff) {
        String style = "";
        for (int i = 0; i < orderList.size(); i++) {
            if (staff == list.orderList.get(i).getStaff()) {
                System.out.println(orderList.get(i).ShowOrder());
                style = orderList.get(i).getStyle();
                orderList.remove(i);
                break;
            }
        }
        if (style.equals(""))
            System.out.println("Cannot Find Record");
        else if (style.equals("Chinese"))
            list.menuList[0].add(1);
        else if (style.equals("Western"))
            list.menuList[1].add(1);
        list.orderList = this.orderList;
    }
}
