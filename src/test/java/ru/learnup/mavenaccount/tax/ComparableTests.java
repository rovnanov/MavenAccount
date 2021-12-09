package ru.learnup.mavenaccount.tax;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComparableTests {

    @Test
    public void comparatorTestFirst() {
        StepsManager manager1 = new StepsManager();
        StepsManager manager2 = new StepsManager();
        manager1.addSteps(1, 10);
        manager1.addSteps(2, 10);
        manager2.addSteps(1, 9);
        manager2.addSteps(2, 15);
        DaysComparator check = new DaysComparator(10);
        int expected = -1;
        int actual = check.compare(manager1, manager2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void comparatorTestSecond() {
        StepsManager manager1 = new StepsManager();
        StepsManager manager2 = new StepsManager();
        manager1.addSteps(1, 10);
        manager1.addSteps(2, 10);
        manager2.addSteps(1, 10);
        manager2.addSteps(2, 10);
        DaysComparator check = new DaysComparator(10);
        int expected = 0;
        int actual = check.compare(manager1, manager2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void comparatorTestThird() {
        StepsManager manager1 = new StepsManager();
        StepsManager manager2 = new StepsManager();
        manager1.addSteps(1, 30);
        manager1.addSteps(2, 30);
        manager2.addSteps(1, 20);
        manager2.addSteps(2, 10);
        DaysComparator check = new DaysComparator(10);
        int expected = 1;
        int actual = check.compare(manager1, manager2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void comparableTestFirst() {
        StepsManager manager1 = new StepsManager();
        StepsManager manager2 = new StepsManager();
        manager1.addSteps(1, 30);
        manager1.addSteps(2, 10);
        manager2.addSteps(1, 40);
        manager2.addSteps(2, 10);
        DaysComparable check = new DaysComparable(manager1);
        int expected = -1;
        int actual = check.compareTo(manager2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void comparableTestSecons() {
        StepsManager manager1 = new StepsManager();
        StepsManager manager2 = new StepsManager();
        manager1.addSteps(1, 50);
        manager1.addSteps(2, 10);
        manager2.addSteps(1, 40);
        manager2.addSteps(2, 10);
        DaysComparable check = new DaysComparable(manager1);
        int expected = 1;
        int actual = check.compareTo(manager2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void comparableTestThird() {
        StepsManager manager1 = new StepsManager();
        StepsManager manager2 = new StepsManager();
        manager1.addSteps(1, 30);
        manager1.addSteps(2, 10);
        manager2.addSteps(1, 30);
        manager2.addSteps(2, 10);
        DaysComparable check = new DaysComparable(manager1);
        int expected = 0;
        int actual = check.compareTo(manager2);

        Assertions.assertEquals(expected, actual);
    }
}
