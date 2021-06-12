package models;

import java.time.LocalDate;
import java.util.ArrayList;

public class ScheduleComposeWeek extends ScheduleCompose{
    public ScheduleComposeWeek(String name) {
        super(name);
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
