package Week2.Day1.MultiplayerPCGame;

import java.util.Random;

public class Player {
    private int points = 0;
    private int lives = 3;

    public Player() {

    }

    public void eatBonus() {
        Random rand = new Random();
        int intRandom = rand.nextBoolean() ? 100 : 150;
        System.out.println("has gained " + intRandom + " points");
        addPoints(intRandom);
        Runner.totalPoints += intRandom;
    }

    public void hitObstacle() {
        Random rand = new Random();
        int intRandom = rand.nextBoolean() ? 100 : 200;
        System.out.println("has lost " + intRandom + " points");
        subtractPoints(intRandom);
        Runner.totalPoints -= intRandom;
    }

    private void addPoints(int numPoints) {
        points += numPoints;
        if (points >= 150) {
            if (lives < 3) {
                lives++;
                points -= 150;
            } else {
                points = 150;
            }
        }
    }

    private void subtractPoints(int numPoints) {
        points -= numPoints;
        while (points < 0) {
            if (points <= 0) {
                lives--;
                if (lives == 0) {
                    Runner.removePlayer(this);
                    return;
                }
                points += 150;
            }
        }
    }

    public void printPlayer() {
        System.out.println("has " + points + " points, and " + lives + " lives.");
    }
}
