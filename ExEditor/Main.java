package ExEditor;

// Main.java (Cliente)
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setText("");
        System.out.println("Texto atual: " + editor.getText());

        editor.type("Olá, ");
        history.save(editor.save());

        editor.type("mundo!");
        history.save(editor.save());

        System.out.println("Texto depois das edições: " + editor.getText());

        // Desfaz a última edição
        editor.restore(history.undo());
        System.out.println("Depois de um undo: " + editor.getText());

        // Desfaz novamente
        editor.restore(history.undo());
        System.out.println("Depois de outro undo: " + editor.getText());
    }
}
