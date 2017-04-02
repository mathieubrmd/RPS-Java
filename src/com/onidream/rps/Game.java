package com.onidream.rps;

/**
 * Created by mathieubourmaud on 2017-04-02.
 */
public class Game {
    private Player player;
    private Player computer;
    private int rounds = 0;

    public Game(Player player, Player computer, int rounds) {
        this.computer = computer;
        this.player = player;
        this.rounds = rounds;
    }

    public void run() {
        for (int i = 0; i < this.rounds; i++) {
            Boolean res = this.player.generateRandomAction().attack(this.computer.generateRandomAction());

            if (res != null) {
                if (!res) {
                    this.computer.setScore(this.computer.getScore() + 1);
                }

                if (res) {
                    this.player.setScore(this.player.getScore() + 1);
                }
            }
        }

        this.showResult();
    }

    private void showResult() {
        if (this.player.getScore() > this.computer.getScore())
            System.out.println(Colors.ANSI_GREEN + "Result: You won " + this.player.getScore() + " time(s), your opponent won " + this.computer.getScore() + " time(s). You win!" + Colors.ANSI_RESET);
        if (this.player.getScore() < this.computer.getScore())
            System.out.println(Colors.ANSI_RED + "Result: You won " + this.player.getScore() + " time(s), your opponent won " + this.computer.getScore() + " time(s). Your opponent wins!" + Colors.ANSI_RESET);
        if (this.player.getScore() == this.computer.getScore())
            System.out.println(Colors.ANSI_BLUE + "Result: You won " + this.player.getScore() + " time(s), your opponent won " + this.computer.getScore() + " time(s). It's a tie!" + Colors.ANSI_RESET);

    }

    public Player getComputer() {
        return computer;
    }

    public void setComputer(Player computer) {
        this.computer = computer;
    }


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
