import java.util.Stack;

public class Undo {
    public Stack<Memento> undoList = new Stack<Memento>();
    public Memento memento;


    public Undo() {}

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
