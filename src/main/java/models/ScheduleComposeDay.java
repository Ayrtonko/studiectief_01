package models;

import java.time.LocalDate;
import java.util.ArrayList;

public class ScheduleComposeDay extends ScheduleCompose{
    public ScheduleComposeDay(String name) {
        super(name);
    }

    @Override
    public ArrayList<LocalDate>setDaysToStudy(){
        return null;
    }

    public ScheduleComposeDay createSchedule(){
        return null;
    }
}
