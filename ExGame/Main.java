package ExGame;

// Main.java (Cliente)
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        GameSaver saver = new GameSaver();

        game.play(); // Joga 1 vez
        game.play(); // Joga 2 vezes

        saver.saveGame(game); // Salva o estado após duas jogadas

        game.play(); // Joga novamente (agora estado mudou)
        game.play(); // Joga novamente

        saver.loadGame(game); // Restaura para o ponto salvo
    }
}
