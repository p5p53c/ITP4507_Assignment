public class Show implements Menu {
    public Show() {
        if (!list.menuList.isEmpty()) {
            for (int i = 0; i < list.menuList.size(); i++) {
                System.out.println(list.menuList.get(i).ShowMenu());
                System.out.println();
            }
        } else {
            System.out.println("No menu available now\n");
        }
    }
}
