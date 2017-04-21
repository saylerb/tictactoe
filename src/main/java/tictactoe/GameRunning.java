package tictactoe;

public class GameRunning {
    private Boolean gameOver;

    public GameRunning() {
        this.gameOver = true;
    }

    public void endGame() {
        gameOver = true;
    }

    public void startGame() {
        gameOver = false;
    }

    public Boolean isRunning() {
        return !gameOver;
    }
}
