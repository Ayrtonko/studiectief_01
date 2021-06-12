package models;

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

    public static NotAvailable createNotAvailable(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("what year");
        int year = scanner.nextInt();
        System.out.println("what month");
        int month = scanner.nextInt();;
        System.out.println("what day");
        int day = scanner.nextInt();;
        System.out.println("what time?");
        int hour = scanner.nextInt();;
        System.out.println("for how long (hours)?");
        int duration = scanner.nextInt();

        LocalDate date = LocalDate.of(year, month,day);
        LocalTime timestart = LocalTime.of(hour,0);
        LocalTime timeend = LocalTime.of(hour + duration,0);

        return new NotAvailableHour(timestart,timeend,date);
    }

    public String toString() {
        return this.NotAvailableHourStart + " till " + this.NotAvailableHourEnd + " on " + this.getNotAvailableDay() + "\n";
    }
}
