package models;

import java.time.LocalDate;
import java.util.Scanner;

public class NotAvailableDay extends NotAvailable {




    private LocalDate notAvailableDay;

    public NotAvailableDay(LocalDate date){
        this.notAvailableDay = date;
    }

    public static NotAvailable createNotAvailable(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("what year");
        int year = scanner.nextInt();
        System.out.println("what month");
        int month = scanner.nextInt();;
        System.out.println("what day");
        int day = scanner.nextInt();;
        LocalDate date = LocalDate.of(year, month,day);
        return new NotAvailableDay(date);
    }


    public String toString() {
        return this.notAvailableDay.getDayOfMonth() + " " + this.notAvailableDay.getMonthValue() + " " + this.notAvailableDay.getYear() + "\n";
    }

    public LocalDate getNotAvailableDay() {
        return notAvailableDay;
    }
}
