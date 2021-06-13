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
import java.util.ArrayList;
import java.util.ResourceBundle;

public class NotAvailableController extends NavigationController implements Initializable {

    @FXML
    private ListView<String> hourList;

    @FXML
    private ListView<NotAvailableDay> dayList;


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
        createNotAvailableDay();
        toNotAvailable();
    }

    @FXML
    void removeDay(MouseEvent event) throws IOException, NullPointerException {
        if(removeCondition()!=null) {
            removeNotAvailableDay();
            toNotAvailable();
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        for(NotAvailableDay i: Account.getLoggedUser().getNotAvailable()) {
            dayList.getItems().add(i);
        }
    }

    public void createNotAvailableDay(){
        if(datePickerToLocalDate(selectDateStart)!=null)
        NotAvailableHour.createNotAvailableDay(datePickerToLocalDate(selectDateStart));
    }

    public void removeNotAvailableDay() {
        if(selectDateStart != null){
            Account.getLoggedUser().getNotAvailable().remove(removeCondition());
        }

    }

    public NotAvailableDay removeCondition() {
        for (NotAvailableDay i : Account.getLoggedUser().getNotAvailable()) {
            if (datePickerToLocalDate(selectDateStart) != null) {
                if (i.getNotAvailableDay().getYear() == datePickerToLocalDate(selectDateStart).getYear() &&
                        (i.getNotAvailableDay().getMonthValue() == datePickerToLocalDate(selectDateStart).getMonthValue()) &&
                        (i.getNotAvailableDay().getDayOfMonth() == datePickerToLocalDate(selectDateStart).getDayOfMonth())) {
                    return i;
                }
            }
        }
        return null;
    }


    public LocalDate datePickerToLocalDate(DatePicker date){
        return date.getValue();
    }





}
