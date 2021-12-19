package ru.learnup.mavenaccount.tax;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StepsManager implements Comparable<StepsManager> {
    protected HashMap<Integer, Integer> stat = new HashMap<>();

    public int add(int day, int steps) {
        if (steps < 0) {
            throw new IllegalStepsException("Количество шагов не должно быть отрицательным значением: " + steps);
        }
        if (day < 1) {
            throw new IllegalDayException("Количество дней не может быть равно нулю или быть отрицательным: " + day);
        }
        if (day > 365) {
            throw new IllegalDayException("Количество дней не может быть больше 365: " + day);
        }
        int newMax;
        if (stat.containsKey(day)) {
            stat.put(day, stat.get(day) + steps);

        } else {
            stat.put(day, steps);
        }
        newMax = stat.get(day) + 1;
        return newMax;
    }

    public List<Integer> getSteps() {
        List<Integer> results = new ArrayList<>();
        for (int day : stat.keySet()) {
            results.add(stat.get(day));
        }
        return results;
    }

    @Override
    public int compareTo(StepsManager o2) {
        List<Integer> results = new ArrayList<>();
        for (int day : stat.keySet()) {
            results.add(stat.get(day));
        }
        int stepsManager1 = 0;
        int stepsManager2 = 0;
        for (int i : results) {
            stepsManager1 += i;
        }
        for (int i : o2.getSteps()) {
            stepsManager2 += i;
        }
        return stepsManager1 - stepsManager2;
    }
}


