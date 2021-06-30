package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Account;

import java.io.IOException;

public abstract class NavigationController {

    @FXML
    private AnchorPane rootPane;

    public void toRegister() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/RegisterController.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void toLogin() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/LoginController.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void toMenu() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/MenuController.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void logout() throws IOException{
        Account.getLoggedAccount().getLogin().logout();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/LoginController.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void toNotAvailable() throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/NotAvailableController.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void toRating() throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/RatingController.fxml"));
        rootPane.getChildren().setAll(pane);
    }


    public void confirmSignup() throws IOException{}
}
