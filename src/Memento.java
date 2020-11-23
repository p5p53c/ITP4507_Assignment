import java.util.Vector;

public class Memento {
    //declaring variables
    private MenuList list;
    private Vector<MenuOrder> orderList = new Vector<MenuOrder>();

    //Constructor
    public Memento(MenuList list) {
        //backup MenuList
        this.list = list;
        //backup MenuOrder
        for (int i = 0; i < list.orderList.size(); i++) {
            try {
                orderList.add(list.orderList.get(i));
            } catch (Exception e) {
                System.out.println("OrderList backup error");
            }
        }
    }

    //restore the menu
    public void restore(int staff) {
        //declaring variables
        String style = "";
        //remove the canceled order
        for (int i = 0; i < orderList.size(); i++) {
            if (staff == list.orderList.get(i).getStaff()) {
                System.out.println(orderList.get(i).ShowOrder());
                style = orderList.get(i).getStyle();
                orderList.remove(i);
                break;
            }
        }
        //No record found
        if (style.equals(""))
            System.out.println("Cannot Find Record");
        //dish quantity return
        else if (style.equals("Chinese"))
            list.menuList[0].add(1);
            //dish quantity return
        else if (style.equals("Western"))
            list.menuList[1].add(1);
        //restore the menu
        list.orderList = this.orderList;
    }
}
