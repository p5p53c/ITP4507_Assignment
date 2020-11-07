public class Show implements Menu {
    public Show() {
        for (int i = 0; i < list.menuList.size(); i++) {
            System.out.println(list.menuList.get(i).ShowMenu());
            System.out.println();
        }
    }
}
