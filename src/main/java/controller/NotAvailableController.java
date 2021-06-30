package controller;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.*;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class NotAvailableController extends NavigationController implements Initializable {

    @FXML
    private ListView<NotAvailable> hourList;

    @FXML
    private ListView<NotAvailable> dayList;


    @FXML
    private DatePicker selectDateHour;

    @FXML
    private TextField hourStart;

    @FXML
    private TextField minuteStart;

    @FXML
    private TextField hourEnd;

    @FXML
    private TextField minuteEnd;

    @FXML
    private Button removeHour;

    @FXML
    private Button addHour;

    @FXML
    private DatePicker selectDateStart;

    @FXML
    private DatePicker selectDateEnd;

    @FXML
    private Button addDay;

    @FXML
    private Button removeDay;

    @FXML
    private Button backButton;

    @FXML
    void createNotAvailableDay(MouseEvent event) throws IOException {
        createAvailableDay();
        toNotAvailable();
    }

    @FXML
    void createNotAvailableHour(MouseEvent event) throws IOException {
        createAvailableHour();
        toNotAvailable();
    }


    public void createAvailableDay(){
        LocalTime time1 = LocalTime.of(0,0);
        LocalTime time2 = LocalTime.of(23,0);
        INotAvailable.createNotAvailable("day", datePickerToLocalDate(selectDateStart), time1, time2);
    }

    public void createAvailableHour(){
        LocalTime time1 = LocalTime.of(toInt(hourStart),toInt(minuteStart));
        LocalTime time2 = LocalTime.of(toInt(hourEnd),toInt(minuteEnd));
        INotAvailable.createNotAvailable("hour", datePickerToLocalDate(selectDateHour), time1, time2);
    }

    public int toInt(TextField textField){
        int num=0;
        if (!textField.getText().equals("")) {
            int sum = Integer.parseInt(textField.getText());
            return num + sum;
        }
        return num;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for (NotAvailable i : Account.getLoggedAccount().getNotAvailable()) {
            if(i instanceof NotAvailableDay)
                dayList.getItems().add(i);

            if(i instanceof  NotAvailableHour)
                hourList.getItems().add(i);
        }
    }




        public LocalDate datePickerToLocalDate (DatePicker date){
            return date.getValue();
        }


    }

