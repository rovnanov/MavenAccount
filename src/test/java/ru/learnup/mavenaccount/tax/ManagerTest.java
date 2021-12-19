package ru.learnup.mavenaccount.tax;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ManagerTest {

    @Test
    public void returnNewMaxTest(){
        StepsManager manager = new StepsManager();
        Assertions.assertEquals(11,manager.addSteps(1,10));
        Assertions.assertEquals(20,manager.addSteps(1,9));
    }
    @Test
    public void setTest(){
        StepsManager manager = new StepsManager();
        manager.addSteps(1,10);
        manager.addSteps(2,10);
        manager.addSteps(3,10);
        manager.addSteps(1,10);
        List<Integer> expected = List.of(20, 10, 10);
        List<Integer> actual = manager.getSteps();
        Assertions.assertEquals(expected, actual);
    }
}
