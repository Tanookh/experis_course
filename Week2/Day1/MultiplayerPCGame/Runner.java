package Week2.Day1.MultiplayerPCGame;

import java.util.Random;

public class Runner {

    public static int totalPoints = 0;
    public static int numPlayers = 1;
    public static Player[] players;

    public static void main(String[] args) {
        players = new Player[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            players[i] = new Player();
        }
        printPlayer();
        System.out.println();
        Player p = new Player();
        addPlayer(p);
        printPlayer();
        System.out.println();
        Random rand = new Random();
        int saveRandom;
        for (int i = 0; i < 3; i++) {
            saveRandom = rand.nextInt(numPlayers);
            System.out.print("Player " + (saveRandom + 1) + " ");
            players[saveRandom].eatBonus();
            saveRandom = rand.nextInt(numPlayers);
            System.out.print("Player " + (saveRandom + 1) + " ");
            players[saveRandom].hitObstacle();
        }
        System.out.println();
        printPlayer();
    }

    public static void printPlayer() {
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Player " + (i + 1) + " ");
            players[i].printPlayer();
        }
    }

    public static void removePlayer(Player player) {
        int save_index = 0;
        for (int i = 0; i < numPlayers; i++) {
            if (player == players[i]) {
                save_index = i;
                for (int j = i; j < numPlayers - 1; j++) {
                    players[j] = players[i + 1];
                }
            }
        }
        System.out.println("Player " + (save_index + 1) + " is removed.");
        numPlayers--;
    }

    public static void addPlayer(Player player) {
        numPlayers++;
        Player[] newPlayers = new Player[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            newPlayers[i] = players[i];
        }
        newPlayers[numPlayers - 1] = player;
        players = newPlayers;
    }

}
