package ExEditor;

// EditorMemento.java (Memento)
public class EditorMemento {
    private final String text;

    public EditorMemento(String text) {
        this.text = text;
    }

    public String getSavedText() {
        return text;
    }
}
