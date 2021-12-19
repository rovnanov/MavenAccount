package ru.learnup.mavenaccount.tax;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StepsManager {
    protected HashMap<Integer, Integer> stat = new HashMap<>();

    public int add(int day, int steps) {
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
}


