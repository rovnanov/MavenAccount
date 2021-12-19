package ru.learnup.mavenaccount.tax;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.Stubber;
import ru.learnup.mavenaccount.tax.StepBattle;
import ru.learnup.mavenaccount.tax.StepsManager;

import java.util.List;

import static org.mockito.Mockito.*;

public class BattleTest {
    StepsManager manager1 = new StepsManager();
    StepsManager manager2 = new StepsManager();

    @Test
    public void battleTest() {
        StepBattle battle = new StepBattle(manager1, manager2);
        battle.addSteps(1, 1, 10);
        battle.addSteps(1, 2, 10);
        battle.addSteps(1, 3, 10);
        battle.addSteps(2, 1, 10);
        battle.addSteps(2, 2, 10);
        battle.addSteps(2, 3, 15);

        int expected = 2;
        int actual = battle.winner();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void battleTest2() {
        StepBattle battle = new StepBattle(manager1, manager2);
        battle.addSteps(1, 1, 10);
        battle.addSteps(1, 2, 10);
        battle.addSteps(1, 3, 20);
        battle.addSteps(2, 1, 10);
        battle.addSteps(2, 2, 10);
        battle.addSteps(2, 3, 15);

        int expected = 1;
        int actual = battle.winner();

        Assertions.assertEquals(expected, actual);
    }

    StepsManager mockManager1 = mock(StepsManager.class);
    StepsManager mockManager2 = mock(StepsManager.class);
    StepBattle mockBattle = new StepBattle(mockManager1, mockManager2);

    @Test
    public void MockitoAddStepsTest() {
        mockBattle.addSteps(1, 1, 10);
        mockBattle.addSteps(2, 1, 20);
        verify(mockManager1).add(1, 10);
        verify(mockManager2).add(1,20);
    }
}