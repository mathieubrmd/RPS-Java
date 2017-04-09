package com.onidream.rps;

/**
 * Created by mathieubourmaud on 2017-04-02.
 * Mathieu Bourmaud - 19941124-P335
 * Martin Porrès - 19940926-P170
 */
public class Main {

    public static void main(String[] args) {
        Game game = new Game(new Player(), new Player());

        game.run();
    }
}
