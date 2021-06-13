package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import model.Account;
import model.Login;
import model.Profile;

import java.io.IOException;

public class RegisterController extends NavigationController{
    @FXML
    private AnchorPane rootPane;

    @FXML
    private TextField regFirst;

    @FXML
    private TextField regName;

    @FXML
    private PasswordField regPass;

    @FXML
    private Button signupButton;

    @FXML
    private Button backButton;


    @FXML
    private Text errorMsg;

    public void signup() throws IOException {
        Login login = new Login(regName.getText(),regPass.getText());
        Profile profile = new Profile(regFirst.getText());
        redirect();
        Account account = new Account(profile,login);
    }

    public Boolean checkUniqueName(){
        Boolean check = true;
        for(Account i: Account.getAllAccounts()){
            if(i.getLogin().getUsername().equals(regName.getText())){
                check = false;
            }
        }
        return check;
    }

    @Override
    public void redirect() throws IOException {
        if(!checkUniqueName()){
            errorMsg.setVisible(true);
        }
        else {
            toLogin();
        }
    }
}
