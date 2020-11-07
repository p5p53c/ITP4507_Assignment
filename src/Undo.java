import java.util.Stack;

public class Undo {
    public Undo() {}
    public Stack<Memento> undoList = new Stack<Memento>();
    public Memento memento;

    public void saveaction(MenuList ml, String action) {
        this.memento = new Memento(ml, action);
        undoList.add(memento);
    }

    public void execute() {
        memento = undoList.lastElement();
        memento.restore();
        undoList.remove(memento);
    }
}
