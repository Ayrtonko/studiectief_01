package model;

import java.time.LocalDate;

public class ScheduleRate extends Schedule{
    public ScheduleRate(String name, int time, LocalDate date) {
        super(name, time, date);
    }

    public void rateSchedule(){
    }

    public Boolean checkRating(){
        return true;
    }
}
