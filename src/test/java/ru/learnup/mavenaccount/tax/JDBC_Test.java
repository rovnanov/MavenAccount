package ru.learnup.mavenaccount.tax;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JDBC_Test {

    @Test
    public void getDayTest() {
        StepsManager manager = new StepsManager();
        int expected = 500;
        Assertions.assertEquals(expected, StepsManager.getSteps(3));
    }
}
