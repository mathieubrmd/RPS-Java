package com.onidream.rps;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Game game = new Game(new Player(), new Player());

        game.run();
    }
}
