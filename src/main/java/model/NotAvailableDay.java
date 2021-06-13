package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class NotAvailableDay extends NotAvailable {
    private LocalDate notAvailableDay;

    public NotAvailableDay(){
    }
    public NotAvailableDay(LocalDate date){
        this.notAvailableDay = date;
    }

    public static NotAvailable createNotAvailableDay(LocalDate date){
        NotAvailable not = new NotAvailableDay(date);
        Account.getLoggedUser().addNotAvailable((NotAvailableDay) not);
        return not;
    }


    public String toString() {
        return this.notAvailableDay.getDayOfMonth() + " " + this.notAvailableDay.getMonthValue() + " " + this.notAvailableDay.getYear();
    }

    public LocalDate getNotAvailableDay() {
        return notAvailableDay;
    }
}
