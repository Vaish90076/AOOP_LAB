// GameState.java - Singleton to manage the game state
public class GameState {

    private static GameState instance;
    private int currentLevel;
    private String difficulty;

    private GameState() {
        currentLevel = 1;
        difficulty = "Easy";
    }

    public static GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
        }
        return instance;
    }

    public void setLevel(int level) {
        currentLevel = level;
    }

    public int getLevel() {
        return currentLevel;
    }

    public void setDifficulty(String diff) {
        difficulty = diff;
    }

    public String getDifficulty() {
        return difficulty;
    }
}
