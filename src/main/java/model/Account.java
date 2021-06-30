package model;

import java.util.ArrayList;

public class Account {
    private static ArrayList<Account> allAccounts = new ArrayList<>();

    Profile profile;
    Login login;
    ArrayList<NotAvailable> notAvailable = new ArrayList<>();
    ArrayList<Rating> givesApp = new ArrayList<>();
    ArrayList<Schedule> creates = new ArrayList<>();

    public Account(Profile profile, Login login) {
        this.profile = profile;
        this.login = login;
        allAccounts.add(this);
    }

    public void addNotAvailable(NotAvailable obj) {
        notAvailable.add(obj);
    }

    public String getProfileFirstname() {
        return this.profile.getFirstName();
    }

    public ArrayList<NotAvailable> getNotAvailable() {
        return notAvailable;
    }

    public static ArrayList<Account> getAllAccounts() {
        return allAccounts;
    }

    public static Account getLoggedAccount() {
        for (Account i : allAccounts) {
            if (i.login.isEnabled()) {
                return i;
            }
        }
        return null;
    }

    public Login getLogin() {
        return login;
    }

    public ArrayList<Rating> getGivesApp() {
        return givesApp;
    }

    public ArrayList<Schedule> getCreates() {
        return creates;
    }

}
