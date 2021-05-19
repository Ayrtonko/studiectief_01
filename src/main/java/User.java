import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class User {
    ArrayList<Schedule> creates = new ArrayList<Schedule>();
    ArrayList<Rating> gives = new ArrayList<Rating>();

    private String name;
    private String password;
    private static Long lastId= 0L;
    private Long id =0L;
    private ArrayList<Calendar> availability= new ArrayList<Calendar>();

    Scanner scanner = new Scanner(System.in);


    public User(String name, String password){
        lastId++;
        this.name = name;
        this.password = password;
        this.id= lastId;
    }

    public void addUser(){
        System.out.println("voer een username in:");
        String username = scanner.nextLine();
        System.out.println("voer een wachtwoord in:");
        String wachtwoord = scanner.nextLine();
        User user = new User(username, wachtwoord);
        System.out.println(username + " is succesvol aangemaakt");
    }

    public void addDateNot(){
        System.out.println("Op welke dag kan je niet studeren?");
        System.out.println("voer jaar in (yyyy/mm/dd)");
        int year = scanner.nextInt();
        System.out.println("voer maand in getallen in (yyyy/mm/dd):");
        int month = scanner.nextInt();
        System.out.println("voer de dag in getallen in (yyyy/mm/dd):");
        int day = scanner.nextInt();
        Calendar calendar = new GregorianCalendar(year, month, day);
        availability.add(calendar);
    }

    public boolean checkAvailabilityDate(){
        return true;
    }

    public void createDaySchedule(){
        System.out.println("voer een naam in voor het schema");
        String name = scanner.nextLine();
        Schedule schedule = new Schedule(name);
        System.out.println("in welk jaar wil je studeren? (yyyy/mm/dd)");
        int year = scanner.nextInt();
        System.out.println("in welke maand wil je studeren? (yyyy/mm/dd)");
        int month = scanner.nextInt();
        System.out.println("Op welke dag van de maand wil je studeren? (yyyy/mm/dd)");
        int day = scanner.nextInt();
        schedule.addSession(year, month, day);
        creates.add(schedule);
    }

    public boolean checkUniqueSchedule(){
        return true;
    }

    public String getAvailabilityList() {
        String sum = "";
        for(Calendar i:availability){
            sum+= i.getTime()+ "\n";
        }
        return sum;
    }

    public String getMyStudySession(){
        String sum ="";
        for(Schedule i:creates){
            sum+= i.getContains() + "\n";
        }
        return sum;
    }




}
