public class List implements Menu {
    public List() {
        if (!list.orderList.isEmpty()) {
            for (int i = 0; i < list.orderList.size(); i++) {
                System.out.println(list.orderList.get(i).ShowOrder());
                System.out.println();
            }
        } else {
            System.out.println("No order is available now\n");
        }
    }
}
