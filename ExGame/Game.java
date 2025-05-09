package ExGame;

// Game.java (Originator)
public class Game {
    private int level;
    private int score;
    private int health;

    public Game() {
        this.level = 1;
        this.score = 0;
        this.health = 100;
    }

    public void play() {
        // Simula progresso
        score += 10;
        health -= 5;
        if (score % 30 == 0) level++;
        System.out.println("Jogando... " + getState());
    }

    public String getState() {
        return String.format("[Nível: %d, Pontuação: %d, Vida: %d]", level, score, health);
    }

    public GameState save() {
        return new GameState(level, score, health);
    }

    public void load(GameState state) {
        this.level = state.getLevel();
        this.score = state.getScore();
        this.health = state.getHealth();
        System.out.println("Estado carregado: " + getState());
    }
}
