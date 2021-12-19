package ru.learnup.mavenaccount.tax;
import java.util.HashMap;
public class StepBattle extends StepsManager {

    private StepsManager manager1;
    private StepsManager manager2;
    public StepBattle(StepsManager manager1, StepsManager manager2){
        this.manager1 = manager1;
        this.manager2 = manager2;
    }
    public void addSteps(int player, int day, int steps) {
        if (player != 1 && player != 2){
            return;
        }
        if (player == 1) {
            manager1.add(day,steps);
        } else {
            manager2.add(day,steps);
        }
    }

    public int winner() {
        int tmpSteps = 0;
        int tmpSteps2 = 0;
        int result;
        for (int day : manager1.stat.keySet()) {
            tmpSteps += manager1.stat.get(day);
        }
        for (int day : manager2.stat.keySet()) {
            tmpSteps2 += manager2.stat.get(day);
        }
        if (tmpSteps > tmpSteps2) {
            result = 1;
        } else {
            result = 2;
        }
        return result;
    }
}
