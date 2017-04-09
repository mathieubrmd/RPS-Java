package com.onidream.rps;

/**
 * Created by mathieubourmaud on 2017-04-03.
 * Mathieu Bourmaud - 19941124-P335
 * Martin Porrès - 19940926-P170
 */
public class InputChecker {
    public Boolean checkRoundNumber(String roundsStr) {

        String regex = "[0-9]+";

        if (roundsStr.matches(regex)) {
            int round = Integer.parseInt(roundsStr);

            if (round > 0 && round <= Integer.MAX_VALUE) {
                return true;
            }

            if (round < 0) {
                System.err.println("The number of round should be a valid number. It cannot be 0.");
            }

            if (round > Integer.MAX_VALUE) {
                System.err.println("The number of round should be a valid number. It cannot be more than the integer type can support.");
            }
        }

        System.err.println("The number is invalid. It should be a number between 0 and " + Integer.MAX_VALUE);

        return false;
    }

    public Boolean checkActionType(String actionName) {

        //System.out.println(actionName);

        if (!actionName.equals("rock") && !actionName.equals("scissors") && !actionName.equals("paper")) {
            System.err.println("\nThe action that you choose should be rock, scissors or paper.");
            return false;
        }

        return true;
    }
}
