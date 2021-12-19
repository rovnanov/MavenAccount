package ru.learnup.mavenaccount.tax;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComparableTests {

    @Test
    public void comparatorTestFirst() {
        StepsManager manager1 = new StepsManager();
        StepsManager manager2 = new StepsManager();
        manager1.add(1, 10);
        manager1.add(2, 10);
        manager2.add(1, 9);
        manager2.add(2, 15);
        DaysComparator check = new DaysComparator(10);
        int expected = -1;
        int actual = check.compare(manager1, manager2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void comparatorTestSecond() {
        StepsManager manager1 = new StepsManager();
        StepsManager manager2 = new StepsManager();
        manager1.add(1, 10);
        manager1.add(2, 10);
        manager2.add(1, 10);
        manager2.add(2, 10);
        DaysComparator check = new DaysComparator(10);
        int expected = 0;
        int actual = check.compare(manager1, manager2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void comparatorTestThird() {
        StepsManager manager1 = new StepsManager();
        StepsManager manager2 = new StepsManager();
        manager1.add(1, 30);
        manager1.add(2, 30);
        manager2.add(1, 20);
        manager2.add(2, 10);
        DaysComparator check = new DaysComparator(10);
        int expected = 1;
        int actual = check.compare(manager1, manager2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void comparableTestFirst() {
        StepsManager manager1 = new StepsManager();
        StepsManager manager2 = new StepsManager();
        manager1.add(1, 30);
        manager1.add(2, 10);
        manager2.add(1, 30);
        manager2.add(2, 20);
        int expected = -10;
        int actual = manager1.compareTo(manager2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void comparableTestSecond() {
        StepsManager manager1 = new StepsManager();
        StepsManager manager2 = new StepsManager();
        manager1.add(1, 50);
        manager1.add(2, 10);
        manager2.add(1, 40);
        manager2.add(2, 10);

        int expected = 10;
        int actual = manager1.compareTo(manager2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void comparableTestThird() {
        StepsManager manager1 = new StepsManager();
        StepsManager manager2 = new StepsManager();
        manager1.add(1, 30);
        manager1.add(2, 10);
        manager2.add(1, 30);
        manager2.add(2, 10);

        int expected = 0;
        int actual = manager1.compareTo(manager2);

        Assertions.assertEquals(expected, actual);
    }
}
