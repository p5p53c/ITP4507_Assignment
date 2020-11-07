public class List implements Menu {
    public List() {
        for (int i = 0; i < list.orderList.size(); i++) {
            System.out.println(list.orderList.get(i).ShowOrder());
            System.out.println();
        }
    }
}
