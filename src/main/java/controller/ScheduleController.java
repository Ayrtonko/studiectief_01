package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.TilePane;
import model.Account;
import model.Period;
import model.Schedule;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ScheduleController extends NavigationController implements Initializable
{
    @FXML
    private AnchorPane rootPane;

    @FXML
    private Button backButton;

    @FXML
    private TilePane tilepane;

    @FXML
    private ListView<Schedule> listDays;

    @FXML
    void toMenu(MouseEvent event) throws IOException {
        toMenu();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for(Schedule i: Account.getLoggedUser().getCreates()){
            listDays.getItems().add(i);
        }
    }

}
