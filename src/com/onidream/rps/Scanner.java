package com.onidream.rps;

/**
 * Created by mathieubourmaud on 2017-04-03.
 */
public class Scanner {

    private java.util.Scanner scanner;

    public Scanner() {
        this.scanner = new java.util.Scanner(System.in);
    }

    public String readRoundNumber() {
        String round = this.scanner.next();

        System.out.println(round);

        return round;
    }

    public String readActionName() {
        String action = this.scanner.next();

        System.out.println(action);

        return action;
    }
}
