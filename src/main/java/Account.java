import java.util.ArrayList;

public class Account {
    private String name;
    private static Long lastId= 0L;
    private Long id =0L;
    private String password;
    private ArrayList<String> availability;
    ArrayList<Schedule> creates = new ArrayList<Schedule>();
    ArrayList<Review> gives = new ArrayList<Review>();

    public Account(){}

    public boolean checkPassword(){}

}
