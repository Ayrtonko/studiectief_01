package model;

import java.util.Scanner;

public class Profile {
    private String firstName;
    public Profile(){
        //remove after tests
    }
    public Profile(String firstName){
        this.firstName= firstName;
    }

    public static Profile createProfile(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your firstname?");
        String firstname = "name";//TODO change to scanner
        return new Profile(firstname);
    }

    public String getFirstName() {
        return firstName;
    }
}
