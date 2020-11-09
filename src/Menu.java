import java.util.Vector;

public interface Menu {
    public Vector<MenuItem> menuList = new Vector<MenuItem>();
    public Undo un = new Undo();
    public Memento memento = new Memento();
    MenuList list = new MenuList();
}
