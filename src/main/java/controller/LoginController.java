package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import model.Account;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController extends NavigationController implements Initializable {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Button registerButton;

    @FXML
    private Text errorMsg;

    public void authentication() throws IOException {
        confirmSignup();
    }

    public void redirect() throws IOException {
        if(passwordCheck()){
            setLoggedAccount(usernameField.getText());
            toMenu();
        }

        else{
            errorMsg.setVisible(true);
        }
    }

    public void setLoggedAccount(String input){
        for(Account i : Account.getAllAccounts()){
            if(i.getLogin().getUsername().equals(input)){
                i.getLogin().login();
            }
        }
    }

    public Boolean passwordCheck(){
        Boolean check = false;
        for(Account i:Account.getAllAccounts()){
            if ((i.getLogin().getUsername().equals(usernameField.getText()) && (i.getLogin().getPassword().equals(passwordField.getText())))){
                check=true;
            }
        }

        return check;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}