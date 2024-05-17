package com.example.contador;

import java.io.Serializable;

public class Countdown implements Serializable {
    private String name;
    private String startDate;
    private boolean repeatWeekly;
    private boolean repeatMonthly;
    private boolean repeatAnnually;
    private boolean remindOneDayBefore;
    private boolean remindOneWeekAfter;
    private String color;

    public Countdown(String name, String startDate, boolean repeatWeekly, boolean repeatMonthly,
                     boolean repeatAnnually, boolean remindOneDayBefore, boolean remindOneWeekAfter, String color) {
        this.name = name;
        this.startDate = startDate;
        this.repeatWeekly = repeatWeekly;
        this.repeatMonthly = repeatMonthly;
        this.repeatAnnually = repeatAnnually;
        this.remindOneDayBefore = remindOneDayBefore;
        this.remindOneWeekAfter = remindOneWeekAfter;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getStartDate() {
        return startDate;
    }

    public boolean isRepeatWeekly() {
        return repeatWeekly;
    }

    public boolean isRepeatMonthly() {
        return repeatMonthly;
    }

    public boolean isRepeatAnnually() {
        return repeatAnnually;
    }

    public boolean isRemindOneDayBefore() {
        return remindOneDayBefore;
    }

    public boolean isRemindOneWeekAfter() {
        return remindOneWeekAfter;
    }

    public String getColor() {
        return color;
    }
}