package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import model.Account;
import model.Question;
import model.Schedule;
import model.ScheduleCompose;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class QuizController extends NavigationController implements Initializable {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private TextField nameField;

    @FXML
    private TextField timeField;

    @FXML
    private Text qOne;

    @FXML
    private Text qTwo;

    @FXML
    private Text qThree;

    @FXML
    private Text notCorrect;

    @FXML
    private Button nextButton;

    @FXML
    private Button backButton;

    @FXML
    private DatePicker dayField;

    @FXML
    void toMenu(MouseEvent event) throws IOException {
        toMenu();
    }

    @FXML
    void toSchedule(MouseEvent event) throws IOException {
        createSchedule();
        toSchedule();
    }





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Question.addToQuestionList();
        qOne.setText(Schedule.getAsked().get(0).toString());
        qTwo.setText(Schedule.getAsked().get(1).toString());
        qThree.setText(Schedule.getAsked().get(2).toString());
    }

    public void createSchedule(){
        LocalDate l = LocalDate.of(dayField.getValue().getYear(), dayField.getValue().getMonth(),dayField.getValue().getDayOfMonth());
        Schedule schedule = new Schedule(nameField.getText(),NavigationController.getTextToInt(timeField), l);
        Account.getLoggedUser().addCreates(schedule);
    }
}
