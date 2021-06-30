package model;

public class Main {
    public static void main(String[] args) {
        Profile profile = new Profile("a");
        Login login = new Login("a","a");
        Account account = new Account(profile, login);
        JavaFXApp.main(args);
        }

}

