package ru.learnup.mavenaccount.tax;
public class IllegalDayException extends IllegalArgumentException{
    public IllegalDayException(String input){
        super(input);
    }
}
