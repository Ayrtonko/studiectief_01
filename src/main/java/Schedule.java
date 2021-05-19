import java.util.ArrayList;

public class Schedule {
    ArrayList<Session> contains = new ArrayList<Session>();

    private String name;

    public Schedule(String name){
    this.name = name;
    }

    public void addSession(int year, int month, int day){
        Session session = new Session(year, month, day);
        contains.add(session);

    }
    public void completeSession(){}
    public void rateSession(int input){}
    public void reschedule(){}

    public String getContains(){
        String sum= "";
        for(Session i: contains){
            sum += i.getStartSession().getTime() +"\n" + "untill"+ "\n" + i.getEndSession().getTime() + "\n";
        }
        return sum;
    }
}