public class List implements Menu {
    //print all order
    public List() {
        
    }
    public void execute() {
        if (!list.orderList.isEmpty()) {//check orderList isEmpty
            System.out.println("Outstanding Orders");
            for (int i = 0; i < list.orderList.size(); i++) { //print order
                System.out.println(list.orderList.get(i).ShowOrder());
            }
            System.out.println();
        } else {
            System.out.println("No order is available now\n");
        }
    }
}
