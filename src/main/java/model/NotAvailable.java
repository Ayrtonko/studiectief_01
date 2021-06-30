package model;


import java.time.LocalDate;
import java.time.LocalTime;

public abstract class NotAvailable extends INotAvailable{

    protected LocalDate notAvailableDay;
    protected LocalTime notAvailableHourStart;
    protected LocalTime notAvailableHourEnd;

    public NotAvailable(){
    }

    public abstract void templateNavailable(LocalDate day,LocalTime timeStart, LocalTime timeEnd);
    public abstract void setDay(LocalDate date);
    public abstract void setTime(LocalTime timeStart, LocalTime timeEnd);

    public LocalDate getNotAvailableDay() {
        return notAvailableDay;
    }

    public LocalTime getNotAvailableHourStart() {
        return notAvailableHourStart;
    }

    public LocalTime getNotAvailableHourEnd() {
        return notAvailableHourEnd;
    }







}
