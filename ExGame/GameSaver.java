package ExGame;

// GameSaver.java (Caretaker)
public class GameSaver {
    private GameState savedState;

    public void saveGame(Game game) {
        savedState = game.save();
        System.out.println("Jogo salvo!");
    }

    public void loadGame(Game game) {
        if (savedState != null) {
            game.load(savedState);
        } else {
            System.out.println("Nenhum estado salvo para carregar.");
        }
    }
}
