package Couplers;

public class InappropriateIntimacy {
    
    private String playerName;
    
    public InappropriateIntimacy(String name) {
        this.playerName = name;
    }
    
    public void playGame(Game game) {
        game.score += 10;
        game.lives--;
        game.level++;
        
        if (game.score > 100) {
            game.powerUp = true;
        }
        
        if (game.lives <= 0) {
            game.gameOver = true;
        }
    }
    
    public boolean canContinuePlaying(Game game) {
        return game.lives > 0 && !game.gameOver && game.level < 10;
    }
}

class Game {
    public int score;
    public int lives;
    public int level;
    public boolean powerUp;
    public boolean gameOver;
    
    public Game() {
        this.score = 0;
        this.lives = 3;
        this.level = 1;
        this.powerUp = false;
        this.gameOver = false;
    }
}