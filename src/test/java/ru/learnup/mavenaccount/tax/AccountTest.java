package ru.learnup.mavenaccount.tax;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class AccountTest {
    Account account = new Account();
    @ParameterizedTest
    @CsvSource({"100,100","500,500","-1000,0"})
    public void testIncome(int income, int expectedIncome) {
        // Account account = new Account();
        account.addIncome(income);

        int expected = expectedIncome;
        int actual = account.getIncome();

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/testincome.csv")
    public void testIncome2(int income, int expectedIncome){
        // Account account = new Account();
        account.addIncome(income);

        int expected = expectedIncome;
        int actual = account.getIncome();

        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/testtax1.csv")
    public void testIncomeTax(int income,int expectedTax){
        account.addIncome(income);

        int expected = expectedTax;
        int actual = account.getIncomeTax(income);

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/testtax2.csv")
    public void testDifferenceTax(int income, int expenses, int expectedTax){
        account.addIncome(income);
        account.addExpenses(expenses);

        int expected = expectedTax;
        int actual = account.getDifferenceTax(income,expenses);

        Assertions.assertEquals(expected,actual);
    }
}
