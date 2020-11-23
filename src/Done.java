public class Done implements Menu {
    //mark the first order is done
    public Done() {
        
    }

    public void execute() {
        System.out.println(list.orderList.get(0).ShowOrder());
        list.orderList.remove(0);
        System.out.println("Order marked as done\n");
    }
}
