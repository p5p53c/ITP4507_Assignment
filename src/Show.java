public class Show implements Menu {
    public Show() {
        if (list.menuList.length != 0) {
            for (int i = 0; i < list.menuList.length; i++) {
                System.out.println(list.menuList[i].ShowMenu());
                System.out.println();
            }
        } else {
            System.out.println("No menu available now\n");
        }
    }
}
