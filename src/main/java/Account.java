import java.util.ArrayList;
import java.util.Calendar;

public class Account {
    private String name;
    private static Long lastId= 0L;
    private Long id =0L;
    private String password;
    private ArrayList<Calendar> availability= new ArrayList<Calendar>();
    private int ratingApp;
    ArrayList<Schedule> creates = new ArrayList<Schedule>();


    public Account(String name, String password){}

    public boolean checkPassword(String input){
        return true;
    }
}