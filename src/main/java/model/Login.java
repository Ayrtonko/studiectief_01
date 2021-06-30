package model;

public class Login extends Ilogin {
    private boolean enabled;

    public Login(String name, String password){
        this.username= name;
        this.password = password;
        enabled = false;
        allLogin.add(this);
    }

    public void login(){
        this.enabled=true;
    }

    public void logout(){
        this.enabled=false;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }






}
