package ru.learnup.mavenaccount.tax;

public class Post {

    private Integer day;
    private Integer steps;

    public Post(Integer day, Integer steps) {
        this.day = day;
        this.steps = steps;
    }

    public Integer getDay() {
        return day;
    }

    public Integer getSteps() {
        return steps;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public void setSteps(Integer steps) {
        this.steps = steps;
    }

    @Override
    public String toString() {
        return day + " day - " +
                steps + " steps";
    }
}
