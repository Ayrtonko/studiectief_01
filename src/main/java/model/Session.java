package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public abstract class Session {
    private Boolean completed;
    private int duration;

    public Session(){
        duration();
    }

    public abstract void duration();

}
