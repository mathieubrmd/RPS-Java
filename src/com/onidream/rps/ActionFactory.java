package com.onidream.rps;

/**
 * Created by mathieubourmaud on 2017-04-02.
 */
public class ActionFactory {
    public AAction createAction(String actionName) {
        if (actionName == "rock") {
            return new Rock(AAction.ActionType.ROCK);
        }
        if (actionName == "paper") {
            return new Paper(AAction.ActionType.PAPER);
        }
        if (actionName == "scissors") {
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
