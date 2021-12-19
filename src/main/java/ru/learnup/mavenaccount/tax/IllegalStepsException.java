package ru.learnup.mavenaccount.tax;

public class IllegalStepsException extends IllegalArgumentException {
    public IllegalStepsException(String input) {
        super(input);
    }
}