import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Account {
    private String name;
    private static Long lastId= 0L;
    private Long id =0L;
    private String password;



    private ArrayList<Calendar> availability= new ArrayList<Calendar>();
    private int ratingApp;
    private boolean loggedIn;
    ArrayList<Schedule> creates = new ArrayList<Schedule>();


    public Account(String name, String password){
        this.name = name;
        this.password = password;
        this.loggedIn = false;
    }

    public boolean checkPassword(String input){
        return true;
    }

    public int checklist(){
        int count = 0;
        if(this.loggedIn)
            count++;
        if(!availability.isEmpty())
            count++;
        if(creates.size() == 0)
            return count;
        if(!creates.get(creates.size()-1).getName().equals(""))
                count++;
        return count;
    }
    public void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String naam = "test";
        System.out.println("Enter your password");
        String password = "test";
        System.out.println("password is correct");
        this.loginSwitch();
    }

    public void loginSwitch(){
        if(loggedIn)
            this.loggedIn = false;
        if(!loggedIn)
            this.loggedIn = true;
    }

    public void setAvailability(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("on what day aren't you available?");
        System.out.println("enter year");
        int year = 2020;
        System.out.println("enter month");
        int month = 5;
        System.out.println("enter day");
        int day = 9;
        Calendar c = new GregorianCalendar();
        c.set(year,month,day);
        availability.add(c);
    }

    public void createSchedule(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name for your studyschedule");
        String name = "test";
        Schedule schedule =  new Schedule(name);
        Schedule schedule2 = new Schedule("");
        creates.add(schedule);

        if (creates.get(creates.size()-1).equalsName(schedule2))
            System.out.println("you cant create schedule, enter a name");

        if (checklist() < 3)
            System.out.println("you cant create a schedule");
    }

    public ArrayList<Calendar> getAvailability() {
        return availability;
    }


}
