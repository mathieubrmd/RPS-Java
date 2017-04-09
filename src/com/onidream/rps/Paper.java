package com.onidream.rps;

/**
 * Created by mathieubourmaud on 2017-04-02.
 * Mathieu Bourmaud - 19941124-P335
 * Martin Porrès - 19940926-P170
 */
public class Paper extends AAction {

    public Paper(ActionType actionType) {
        this.setActionType(actionType);
    }

    @Override
    public Boolean attack(AAction action) {

        if (this.getActionType() == action.getActionType())
            System.out.println("You chose paper, your opponent chose paper. It’s a tie!\n");

        if (action.getActionType() == ActionType.SCISSORS) {
            System.out.println("You chose paper, your opponent chose scissors. Your opponent wins!\n");
            return false;
        }

        if (action.getActionType() == ActionType.ROCK) {
            System.out.println("You chose paper, your opponent chose rock. You win!\n");
            return true;
        }

        return null;
    }
}
