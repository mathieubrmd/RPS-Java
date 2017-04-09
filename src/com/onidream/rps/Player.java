package com.onidream.rps;

import java.util.Random;

/**
 * Created by mathieubourmaud on 2017-04-02.
 * Mathieu Bourmaud - 19941124-P335
 * Martin Porrès - 19940926-P170
 */
public class Player {
    private AAction currentAction;
    private ActionFactory actionFactory = new ActionFactory();
    private int score = 0;

    public AAction generateRandomAction() {
        AAction.ActionType[] actionTypes = AAction.ActionType.values();
        Random random = new Random();
        int randomEnum = random.nextInt(actionTypes.length);

        return actionFactory.createAction(randomEnum);
    }

    public AAction getCurrentAction() {
        return currentAction;
    }

    public void setCurrentAction(AAction currentAction) {
        this.currentAction = currentAction;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public ActionFactory getActionFactory() {
        return actionFactory;
    }

    public void setActionFactory(ActionFactory actionFactory) {
        this.actionFactory = actionFactory;
    }
}
