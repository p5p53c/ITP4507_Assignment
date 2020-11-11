import java.util.Vector;

public interface Menu {
    public Vector<MenuItem> menuList = new Vector<MenuItem>();
    public CareTaker ct = new CareTaker();
    public Memento memento = new Memento();
    MenuList list = new MenuList();
}
