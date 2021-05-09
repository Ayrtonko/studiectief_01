import java.util.ArrayList;

public class Schedule {


    private String name;
    ArrayList<Session>has = new ArrayList<Session>();

    public Schedule(String name){
        this.name = name;
    }

    public String summary(){
        return "";
    }

    public Schedule export(){
        return this;
    }
    public String getName() {
        return name;
    }
    public boolean equalsName(Schedule that){
        return this.getName() == that.getName();
    }
}