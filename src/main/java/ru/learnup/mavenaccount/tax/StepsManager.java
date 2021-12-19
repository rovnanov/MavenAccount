package ru.learnup.mavenaccount.tax;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StepsManager {
    private HashMap<Integer, Integer> stat = new HashMap<>();

    public int addSteps(int day, int steps) {
        int newMax;
        if (stat.containsKey(day)) {
            stat.put(day, stat.get(day) + steps);

        } else {
            stat.put(day, steps);
        }
        newMax = stat.get(day) + 1;
        return newMax;
    }

    public void print() {
        System.out.println(stat);
    }
    public List<Integer> getSteps(){
        List<Integer> results = new ArrayList<>();
        for (int day : stat.keySet()){
            results.add(stat.get(day));
        }
        return results;
    }
}


