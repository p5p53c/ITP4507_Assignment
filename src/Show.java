public class Show implements Menu {
    public Show() {
        if (list.menuList.length != 0) { //check menu isEmpty
            for (int i = 0; i < list.menuList.length; i++) {//print menu and dish data
                System.out.println(list.menuList[i].ShowMenu());
                System.out.println();
            }
        } else {
            System.out.println("No menu available now\n");
        }
    }
}
