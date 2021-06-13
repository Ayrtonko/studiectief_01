package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class ScheduleComposeDay extends ScheduleCompose{
    public ScheduleComposeDay(String name, int time, LocalDate date) {
        super(name, time, date);
    }

    @Override
    public ArrayList<LocalDate>setDaysToStudy(){
        return null;
    }

    public ScheduleComposeDay createSchedule(){
        return null;
    }
}
