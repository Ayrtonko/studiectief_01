import java.util.ArrayList;

public class Schedule {
    private String name;
    ArrayList<Session>has = new ArrayList<Session>();

    public Schedule(String name){}

    public String summary(){
        return "";
    }

    public Schedule export(){
        return this;
    }
}
