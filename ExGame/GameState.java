package ExGame;

// GameState.java (Memento)
public class GameState {
    private final int level;
    private final int score;
    private final int health;

    public GameState(int level, int score, int health) {
        this.level = level;
        this.score = score;
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }

    public int getHealth() {
        return health;
    }
}

