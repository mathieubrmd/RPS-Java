package com.onidream.rps;

/**
 * Created by mathieubourmaud on 2017-04-02.
 */
public class Scissors extends AAction {

    public Scissors(ActionType actionType) {
        this.setActionType(actionType);
    }

    @Override
    public Boolean attack(AAction action) {

        if (this.getActionType() == action.getActionType())
            System.out.println("You chose scissors, your opponent chose scissors. It’s a tie!\n");

        if (action.getActionType() == ActionType.ROCK) {
            System.out.println("You chose scissors, your opponent chose rock. Your opponent wins!\n");
            return false;
        }

        if (action.getActionType() == ActionType.PAPER) {
            System.out.println("You chose scissors, your opponent chose paper. You win!\n");
            return true;
        }

        return null;
    }
}
