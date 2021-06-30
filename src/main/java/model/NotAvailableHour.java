package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class NotAvailableHour extends NotAvailable {

    public NotAvailableHour(LocalDate day, LocalTime timeStart, LocalTime timeEnd) {
        templateNavailable(day, timeStart, timeEnd);
    }


    @Override
    public void templateNavailable(LocalDate day, LocalTime timeStart, LocalTime timeEnd) {
        setDay(day);
        setTime(timeStart, timeEnd);
    }

    @Override
    public void setDay(LocalDate day) {
        this.notAvailableDay = day;
    }

    @Override
    public void setTime(LocalTime timeStart, LocalTime timeEnd) {
        this.notAvailableHourStart =timeStart;
        this.notAvailableHourEnd = timeEnd;
    }

    public String toString() {
        try {
            return notAvailableHourStart + " till " + notAvailableHourEnd + " on " + this.notAvailableDay.getDayOfMonth() + " " + this.notAvailableDay.getMonthValue() + " " + this.notAvailableDay.getYear();
        }
        catch (NullPointerException e){
            return "error";
        }
        }
}
