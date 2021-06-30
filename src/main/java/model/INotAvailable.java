package model;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class INotAvailable {

    public static NotAvailable createNotAvailable(String schedule, LocalDate day,LocalTime timeStart, LocalTime timeEnd){
        if(schedule.equals("day")){
            NotAvailable notAvailableDay = new NotAvailableDay(day, timeStart, timeEnd);
            Account.getLoggedAccount().addNotAvailable(notAvailableDay);
            return notAvailableDay;
        }

        else if(schedule.equals("hour")){
            NotAvailable notAvailableHour = new NotAvailableHour(day, timeStart, timeEnd);
            Account.getLoggedAccount().addNotAvailable(notAvailableHour);
            return notAvailableHour;
        }
        return null;
    }
}
