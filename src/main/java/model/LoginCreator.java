package model;

public class LoginCreator extends Ilogin {

    public static Boolean checkUniqueUsername(String username){
        for(Login i: allLogin){
            if(i.getUsername().equals(username)){
                return false;
            }
        }
        return true;
    }

    public static Login loginCreate(String username, String password){
            Login login = new Login(username, password);
            return login;
    }
}
