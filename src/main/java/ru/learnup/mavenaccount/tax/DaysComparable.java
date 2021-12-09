package ru.learnup.mavenaccount.tax;

import java.util.List;

public class DaysComparable implements Comparable<StepsManager> {
    private int steps;

    public DaysComparable(StepsManager o1) {
        this.steps = o1.getMaxStep();
    }

    @Override
    public int compareTo(StepsManager o2) {
        if (steps < o2.getMaxStep()) {
            return -1;
        } else if (steps > o2.getMaxStep()) {
            return 1;
        } else {
            return 0;
        }
    }
}
