package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuController extends NavigationController implements Initializable {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private Button plusButton;

    @FXML
    private Button planButton;

    @FXML
    private Button reButton;

    @FXML
    private Button rateButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
