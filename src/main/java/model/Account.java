package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    private boolean enabled;
    private Profile profile;
    private Login login;

    private static ArrayList<Account>allAccounts = new ArrayList<Account>();
    private ArrayList <NotAvailableDay> notAvailable = new ArrayList<>();
    private ArrayList <Rating>givesApp = new ArrayList<>();
    private ArrayList<Schedule>creates = new ArrayList<>();

    public Account(Profile profile, Login login){
        this.profile = profile;
        this.login = login;
        allAccounts.add(this);
        this.enabled=false;
    }

    public ArrayList<Schedule> getCreates() {
        return creates;
    }

    public void addCreates(Schedule schedule){
        creates.add(schedule);
    }
    public static void login(String nameInput, String passInput){

        for(Account i: allAccounts){
            if((i.getLogin().getUsername().equals(nameInput)) && (i.getLogin().getPassword().equals(passInput))){
                i.setEnabled(true);
            }
            System.out.println("you're logged in");
        }
    }

    public static void logout(){
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

    public ArrayList<Rating> getGivesApp() {
        return givesApp;
    }

    public static Account createAccount(){
        Login.createLogin();
        return new Account(Profile.createProfile(), Login.createLogin());
    }

    public void addRating(Rating rate){
        givesApp.add(rate);
    }

    public void addNotAvailable(NotAvailableDay obj){
        notAvailable.add(obj);
    }

    public String getProfileFirstname(){
        return this.profile.getFirstName();
    }

    public String getUsernameLogin(){
        return this.login.getUsername();
    }

    public String getPasswordLogin(){
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

    public ArrayList<NotAvailableDay> getNotAvailable() {
        return notAvailable;
    }


}
