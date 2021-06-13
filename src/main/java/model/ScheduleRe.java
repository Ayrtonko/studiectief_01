package model;

import java.time.LocalDate;

public class ScheduleRe extends ScheduleCompose{
    public ScheduleRe(String name, int time, LocalDate date) {
        super(name, time, date);
    }

    public Boolean checkRescheduke(){
        return true;
    }
}
