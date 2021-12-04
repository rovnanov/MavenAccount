package ru.learnup.mavenaccount.tax;

public class Account {
    private int income;
    private int expenses;

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
        if (expenses < 0{
            return;
        }
        this.expenses += expenses;
    }
    public int getExpenses(){
        return expenses;
    }
}
