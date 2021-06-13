package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class ScheduleComposeWeek extends ScheduleCompose{
    public ScheduleComposeWeek(String name, int time, LocalDate date) {
        super(name,time, date);
    }

    @Override
    public ArrayList<LocalDate> setDaysToStudy(){
        return null;
    }

    @Override
    public ScheduleComposeWeek createSchedule(){
        return null;
    }


}
