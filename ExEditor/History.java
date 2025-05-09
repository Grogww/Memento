package ExEditor;

// History.java (Caretaker)
import java.util.Stack;

public class History {
    private final Stack<EditorMemento> history = new Stack<>();

    public void save(EditorMemento memento) {
        history.push(memento);
    }

    public EditorMemento undo() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return new EditorMemento(""); // estado vazio como fallback
    }
}
