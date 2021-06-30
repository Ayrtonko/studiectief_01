package model;

import java.util.ArrayList;

public abstract class ISchedule {
    ArrayList<Session> contains = new ArrayList<>();
    public abstract void createSchedule();

}
