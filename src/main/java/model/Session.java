package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Session {
    private LocalDate date;
    private int durationSession;
    private Boolean completed;
    private int ratingSession;
    private ArrayList<Period> has;

    public Session(LocalDate date){
    }

    public static Session createSession(){
        return null;
    }
    public void rateSession(int rate){
        this.ratingSession = rate;
    }
}
