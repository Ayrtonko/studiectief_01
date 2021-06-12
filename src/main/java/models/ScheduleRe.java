package models;

public class ScheduleRe extends ScheduleCompose{
    public ScheduleRe(String name) {
        super(name);
    }

    public Boolean checkRescheduke(){
        return true;
    }
}
