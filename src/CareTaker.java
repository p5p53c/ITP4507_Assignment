import java.util.Stack;

public class CareTaker {
    public Stack<Memento> undoList = new Stack<Memento>();
    public Memento memento;

    //back up the MenuList
    public void saveAction(MenuList list) {
        this.memento = new Memento(list);
        undoList.add(memento);
    }

    //Cancel the Order
    public void undo(int staff) {
        memento = undoList.lastElement();
        memento.restore(staff);
        undoList.remove(memento);
    }
}
