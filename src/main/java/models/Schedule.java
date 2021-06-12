package models;

import java.time.LocalTime;
import java.util.ArrayList;

public abstract class Schedule {
    private String name;
    private int hoursToComplete;
    private ArrayList<LocalTime>daysToStudy = new ArrayList<>();
    private Boolean completed;
    private int ratingSchedule;

    private ArrayList<Session>contains = new ArrayList<>();
    private ArrayList<Quiz>uses = new ArrayList<>() ;

    public Schedule(String name){
        this.name = name;
    }

    public Boolean checkCompleted(){
        return true;
    }

    public void addScheduleToAccount(){
    }
}
