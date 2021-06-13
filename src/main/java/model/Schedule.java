package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Schedule {
    private String name;
    private int hoursToComplete;
    private LocalDate date;
    private Boolean completed;
    private int ratingSchedule;
    private ArrayList<Session>contains = new ArrayList<>();
    private static ArrayList<Question>asked = new ArrayList<>();

    public Schedule(String name, int hours, LocalDate date){
        this.name = name;
        this.hoursToComplete = hours;
        this.date = date;
    }
    public int getHoursToComplete() {
        return hoursToComplete;
    }
    public ArrayList<Session> getContains() {
        return contains;
    }


    public static void addAsked(Question question){
        asked.add(question);
    }
    public static ArrayList<Question> getAsked() {
        return asked;
    }
    public Boolean checkCompleted(){
        return true;
    }

    public void addScheduleToAccount(){
    }
    public String toString(){
        return String.valueOf(date.getDayOfMonth() + " " + date.getMonthValue() + " " + date.getYear());
    }
}
