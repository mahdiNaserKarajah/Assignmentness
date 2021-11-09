package com.example.assignment1fitness.model;

public class Diet {
    private int day;
    private int NumberOfMeals;
    private String details;

    public Diet(int day, int numberOfMeals, String details) {
        this.day = day;
        NumberOfMeals = numberOfMeals;
        this.details = details;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getNumberOfMeals() {
        return NumberOfMeals;
    }

    public void setNumberOfMeals(int numberOfMeals) {
        NumberOfMeals = numberOfMeals;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Diet{" +
                "day=" + day +
                ", NumberOfMeals=" + NumberOfMeals +
                ", details='" + details + '\'' +
                '}';
    }
}
