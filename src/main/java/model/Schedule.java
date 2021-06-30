package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public abstract class Schedule {
    private String name;
    private int hoursToComplete;
    private Boolean completed;
    private int ratingSchedule;
    private ArrayList<LocalDate> daysToStudy = new ArrayList<>();

    public Schedule(String name){
        this.name = name;
    }

    public abstract void templateSchedule();
    public abstract void setSessions();
    public abstract void setDaysToStudy();
    public abstract void setHoursToComplete();

}
