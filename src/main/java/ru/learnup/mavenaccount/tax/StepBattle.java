package ru.learnup.mavenaccount.tax;
import java.util.HashMap;
public class StepBattle extends StepsManager {

    public void addSteps(int player, int day, int steps) {
        if (player == 1) {
            if (stepCounter.containsKey(day)) {
                stepCounter.put(day, stepCounter.get(day) + steps);
            } else {
                stepCounter.put(day, steps);
            }
        } else {
            if (stepCounter2.containsKey(day)) {
                stepCounter2.put(day, stepCounter2.get(day) + steps);
            } else {
                stepCounter2.put(day, steps);
            }
        }
    }

    public int winner() {
        int tmpSteps = 0;
        int tmpSteps2 = 0;
        int result;
        for (int day : stepCounter.keySet()) {
            tmpSteps += stepCounter.get(day);
        }
        for (int day : stepCounter2.keySet()) {
            tmpSteps2 += stepCounter2.get(day);
        }
        if (tmpSteps > tmpSteps2) {
            result = 1;
        } else {
            result = 2;
        }
        return result;
    }
}
