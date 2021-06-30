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

    public static Profile createProfile(String firstName){
        return new Profile(firstName);
    }

    public String getFirstName() {
        return firstName;
    }
}
