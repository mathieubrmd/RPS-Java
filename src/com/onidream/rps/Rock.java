package com.onidream.rps;

/**
 * Created by mathieubourmaud on 2017-04-02.
 * Mathieu Bourmaud - 19941124-P335
 * Martin Porrès - 19940926-P170
 */
public class Rock extends AAction {

    public Rock(ActionType actionType) {
        this.setActionType(actionType);
    }

    @Override
    public Boolean attack(AAction action) {

        if (this.getActionType() == action.getActionType())
            System.out.println("You chose scissors, your opponent chose scissors. It’s a tie!\n");

        if (action.getActionType() == ActionType.PAPER) {
            System.out.println("You chose rock, your opponent chose paper. Your opponent wins!\n");
            return false;
        }

        if (action.getActionType() == ActionType.SCISSORS) {
            System.out.println("You chose rock, your opponent chose scissors. You win!\n");
            return true;
        }

        return null;
    }
}
