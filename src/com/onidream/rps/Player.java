package com.onidream.rps;

import java.util.Random;

/**
 * Created by mathieubourmaud on 2017-04-02.
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
