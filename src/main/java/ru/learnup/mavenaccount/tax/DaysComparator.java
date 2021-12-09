package ru.learnup.mavenaccount.tax;

import java.util.Comparator;
import java.util.List;

public class DaysComparator implements Comparator<StepsManager> {

    private int minSteps;
    public DaysComparator(int minSteps) {
        this.minSteps = minSteps;
    }

    @Override
    public int compare(StepsManager o1, StepsManager o2) {
        List<Integer> steps1 = o1.getSteps();
        List<Integer> steps2 = o2.getSteps();
        int days1 = 0;
        int days2 = 0;

        for (int steps : steps1) {
            if (steps > minSteps) {
                days1++;
            }
        }
        for (int steps : steps2) {
            if (steps > minSteps) {
                days2++;
            }
        }
        return days1 - days2;
    }
}
