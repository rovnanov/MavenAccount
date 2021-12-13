package ru.learnup.mavenaccount.tax.entities;

import javax.persistence.*;
@Entity
@Table(name = "manager")
public class Post {
    @Id
    private Integer day;
    @Column
    private Integer steps;

    public Post() {
    }

    public Post(Integer steps) {
        this.steps = steps;
    }

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
        return day + " day - " + steps + " steps";
    }
}
