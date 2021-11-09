package com.example.assignment1fitness.model;

public class training {
    private int day;
    private int time;
    private String exercises;

    public training(int day, int time, String exercises) {
        this.day = day;
        this.time = time;
        this.exercises = exercises;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getExercises() {
        return exercises;
    }

    public void setExercises(String exercises) {
        this.exercises = exercises;
    }

    @Override
    public String toString() {
        return "training{" +
                "day=" + day +
                ", time=" + time +
                ", exercises='" + exercises + '\'' +
                '}';
    }
}
