package com.onidream.rps;

/**
 * Created by mathieubourmaud on 2017-04-02.
 */
public abstract class AAction {
   public enum ActionType {
        ROCK,
        PAPER,
        SCISSORS;
    }

    private ActionType actionType;

    public abstract Boolean attack(AAction action);

    public ActionType getActionType() {
        return actionType;
    }

    public void setActionType(ActionType actionType) {
        this.actionType = actionType;
    }
}
