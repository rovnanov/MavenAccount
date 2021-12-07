package ru.learnup.mavenaccount.tax;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StepsManager {
    private HashMap<Integer, Integer> stat = new HashMap<>();

    public void addSteps(int day, int steps) {
        if (stat.containsKey(day)) {
            stat.put(day, stat.get(day) + steps);
        } else {
            stat.put(day, steps);
        }
    }

    public int getMaxStep() {
        int result = 0;
        for(int day : stat.keySet()){
            if(stat.get(day) > result){
                result += stat.get(day);
            }
        }
        return result + 1;
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


