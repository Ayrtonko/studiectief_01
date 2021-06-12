package models;

import java.time.LocalDate;
import java.util.ArrayList;

public class ScheduleCompose extends Schedule {

    public ScheduleCompose(String name) {
        super(name);
    }

    public Boolean checkAvailableList(){
        return true;
    }

    public Boolean checkDaypart(){
        return true;
    }

    public ArrayList<LocalDate>setDaysToStudy(){
        return null;
    }

    public int setHoursToStudy(){
        return 0;
    }

    public Schedule createSchedule(){
        return null;
    }


}
