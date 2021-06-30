package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import model.Account;
import model.LoginCreator;
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
        confirmSignup();
    }



   @Override
    public void confirmSignup() throws IOException {
        if(!LoginCreator.checkUniqueUsername(regName.getText())){
            errorMsg.setVisible(true);
        }
        else if(LoginCreator.checkUniqueUsername(regName.getText())){
            Account account = new Account(Profile.createProfile(regFirst.getText()),LoginCreator.loginCreate(regName.getText(), regPass.getText()));
            toLogin();
        }
    }


}
