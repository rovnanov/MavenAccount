package ru.learnup.mavenaccount.tax;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.mockito.Mockito.doReturn;

public class ManagerTest {

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
    @Test
    public void getMaxStepTest(){
        StepsManager manager = new StepsManager();
        manager.addSteps(1,10);
        manager.addSteps(2,10);
        manager.addSteps(3,10);
        manager.addSteps(1,10);
        int expected = 21;
        int actual = manager.getMaxStep();
        Assertions.assertEquals(expected, actual);
    }
}
