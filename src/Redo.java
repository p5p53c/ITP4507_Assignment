import java.util.Stack;

public class Redo {
    public Redo() {}
    public Stack<Memento> redoList = new Stack<Memento>();
    public Memento memento;

    public void saveaction(MenuList ml, String action) {
        memento = new Memento(ml, action);
        redoList.add(memento);
    }

    public void execute() {
        memento = redoList.lastElement();
        memento.restore();
        redoList.remove(memento);
    }
}
