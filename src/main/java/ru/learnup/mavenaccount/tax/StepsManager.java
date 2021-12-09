package ru.learnup.mavenaccount.tax;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class StepsManager {
    protected HashMap<Integer, Integer> stepCounter = new HashMap<>();
    protected HashMap<Integer, Integer> stepCounter2 = new HashMap<>();

    public void addSteps(int day, int steps) {
        if (stepCounter.containsKey(day)) {
            stepCounter.put(day, stepCounter.get(day) + steps);
        } else {
            stepCounter.put(day, steps);
        }
    }

    public int getMaxStep() {
        int result = 0;
        for (int day : stepCounter.keySet()) {
            if (stepCounter.get(day) > result) {
                result += stepCounter.get(day);
            }
        }
        return result + 1;
    }

    public void print() {
        System.out.println(stepCounter);
    }

    public List<Integer> getSteps() {
        List<Integer> results = new ArrayList<>();
        for (int day : stepCounter.keySet()) {
            results.add(stepCounter.get(day));
        }
        return results;
    }
    public Stream<Integer> getAllAbove(int steps){
        return stepCounter.keySet().stream()
                .filter(i -> i > steps);
    }
}


