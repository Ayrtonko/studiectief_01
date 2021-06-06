import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    private boolean enabled;
    private Profile profile;
    private Login login;

    private static ArrayList<Account>allAccounts = new ArrayList<Account>();

    private ArrayList <NotAvailable> notAvailable = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void addNotAvailableDayToAccount(){
        Account account = getLoggedUser();
        account.notAvailable.add(NotAvailableDay.createNotAvailable());
    }

    public void addNotAvailableHourToAccount(){
        Account account = getLoggedUser();
        account.notAvailable.add(NotAvailableHour.createNotAvailable());
    }



    public Account(Profile profile, Login login){
        this.profile = profile;
        this.login = login;
        allAccounts.add(this);
        this.enabled=false;
    }

    public static void login(String nameInput, String passInput){

        for(Account i: allAccounts){
            if((i.getLogin().getUsername().equals(nameInput)) && (i.getLogin().getPassword().equals(passInput))){
                i.setEnabled(true);
            }
            System.out.println("you're logged in");
        }
    }
    public void logout(){
        for(Account i: allAccounts){
            if(i.isEnabled()) {
                i.enabled = false;
            }
        }
    }

    public static Account getLoggedUser(){
            for(Account i: allAccounts){
                if(i.enabled)
                    return i;
            }
            return null;
    }

    public static Account createAccount(){
        Login.createLogin();
        return new Account(Profile.createProfile(), Login.createLogin());
    }

    public String getProfileFirstname(){
        return this.profile.getFirstName();
    }

    public String getUsernameLogin(){
        return this.login.getUsername();
    }

    public  String getPasswordLogin(){
        return login.getPassword();
    }

    public Profile getProfile() {
        return profile;
    }

    public Login getLogin() {
        return login;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public static ArrayList<Account> getAllAccounts() {
        return allAccounts;
    }

    public ArrayList<NotAvailable> getNotAvailable() {
        return notAvailable;
    }


}
