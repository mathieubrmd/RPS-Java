package com.onidream.rps;

/**
 * Created by mathieubourmaud on 2017-04-03.
 * Mathieu Bourmaud - 19941124-P335
 * Martin Porrès - 19940926-P170
 */
public class Scanner {

    private java.util.Scanner scanner;

    public Scanner() {
        this.scanner = new java.util.Scanner(System.in);
    }

    public String readRoundNumber() {
        String round = this.scanner.next();

        return round;
    }

    public String readActionName() {
        String action = this.scanner.next();

        return action;
    }
}
