package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class NotAvailableHour extends NotAvailableDay{
    private LocalTime NotAvailableHourStart;
    private LocalTime NotAvailableHourEnd;

    public NotAvailableHour(LocalTime start, LocalTime end, LocalDate date){
        super(date);
        this.NotAvailableHourStart = start;
        this.NotAvailableHourEnd = end;
    }

    public static NotAvailable createNotAvailableDay(LocalDate date, int hour, int minute){
        LocalTime timeStart = LocalTime.of(hour, minute);
        LocalTime timeEnd = LocalTime.of(hour, minute);
        NotAvailableHour not = new NotAvailableHour(timeStart,timeEnd,date);
        return null;
    }


    public String toString() {
        return this.NotAvailableHourStart + " till " + this.NotAvailableHourEnd + " on " + this.getNotAvailableDay() + "\n";
    }
}
