package ru.learnup.mavenaccount.tax;

public class Account {
    private int income;
    private int expenses;
    private int incomeTax;
    private int differenceTax;

    public void addIncome(int income){
        if (income < 0){
            return;
        }
        this.income += income;
    }
    public int getIncome(){
        return income;
    }
    public void addExpenses(int expenses){
        if (expenses < 0)
            return;
        this.expenses += expenses;
    }
    public int getExpenses(){
        return expenses;
    }
    public int getIncomeTax(int income){
        int taxRate = 6;
        int result;
        result = income * taxRate / 100;
        if (result < 0)
            return 0;
        return result;
    }
    public int getDifferenceTax(int income, int expenses){
        int taxRate = 15;
        int result;
        int a = income - expenses;
        result = a * taxRate / 100;
        if (result < 0)
            return 0;
        return result;
    }
}
