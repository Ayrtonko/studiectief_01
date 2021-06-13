package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    private String username;
    private String password;
    private static ArrayList<Login>allUsernames = new ArrayList<>();

    public Login(){
        //remove after tests
    }
    public Login(String username, String password){
        this.username = username;
        this.password = password;
        allUsernames.add(this);
    }

    public static Login createLogin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("what username would you like?");
        String username = "user"; //TODO change to scanner
        if(checkUniqueUsername(username)){
            System.out.println("Username already exists");
            return null;
        }
            System.out.println("what's the desired password?");
            String password = "ww"; //TODO change to scanner
            return new Login(username, password);

    }

    public static boolean checkUniqueUsername(String username){
        for(Login i:allUsernames){
            if(i.getUsername().equals(username)){
                return false;
            }
        }
        return true;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

}
