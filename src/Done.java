public class Done implements Menu {
    public Done() {
        System.out.println(list.orderList.get(0).ShowOrder());
        list.orderList.remove(0);
        System.out.println("Order marked as done\n");
    }
}
