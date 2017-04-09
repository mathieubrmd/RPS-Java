package com.onidream.rps;

/**
 * Created by mathieubourmaud on 2017-04-02.
 * Mathieu Bourmaud - 19941124-P335
 * Martin Porrès - 19940926-P170
 */
public class ActionFactory {
    public AAction createAction(String actionName) {
        if (actionName.equals("rock")) {
            return new Rock(AAction.ActionType.ROCK);
        }
        if (actionName.equals("paper")) {
            return new Paper(AAction.ActionType.PAPER);
        }
        if (actionName.equals("scissors")) {
            return new Scissors(AAction.ActionType.SCISSORS);
        }

        return null;
    }

    public AAction createAction(int val) {
        if (val == 0) {
            return new Rock(AAction.ActionType.ROCK);
        }
        if (val == 1) {
            return new Paper(AAction.ActionType.PAPER);
        }
        if (val == 2) {
            return new Scissors(AAction.ActionType.SCISSORS);
        }

        return null;
    }
}
