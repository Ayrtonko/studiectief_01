package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class NotAvailableDay extends NotAvailable {

    public NotAvailableDay(LocalDate day, LocalTime timeStart, LocalTime timeEnd){
        templateNavailable(day, timeStart,timeEnd);
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
        timeStart = LocalTime.of(0,0);
        timeEnd = LocalTime.of(23,0);
        this.notAvailableHourStart = timeStart;
        this.notAvailableHourEnd = timeEnd;
    }

    public String toString() {
        try {
            return this.notAvailableDay.getDayOfMonth() + " " + this.notAvailableDay.getMonthValue() + " " + this.notAvailableDay.getYear();
        }

        catch(NullPointerException e){
            return "error";
        }
    }

    public LocalDate getNotAvailableDay() {
        return notAvailableDay;
    }
}
