package controller;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import model.Account;
import model.Rating;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RatingController extends NavigationController implements Initializable {

    @FXML
    private Text rateDisplay;

    @FXML
    private Text ratePreview;

    @FXML
    private Button backButton;

    @FXML
    private Button setOne;

    @FXML
    private Button setTwo;

    @FXML
    private Button setThree;

    @FXML
    private Button setFour;

    @FXML
    private Button setFive;


    @FXML
    private Button confirmButton;

    private static int rate;



    @FXML
    void confirmRating(MouseEvent event) throws IOException{
        if(Rating.checkRating(rate)) {
            Account.getLoggedAccount().getGivesApp().add(new Rating(rate));
            toRating();
        }
    }

    @FXML
    void setToFive(MouseEvent event)throws IOException {
        rate = 5;
        toRating();
    }

    @FXML
    void setToFour(MouseEvent event) throws IOException{
        rate = 4;
        toRating();
    }

    @FXML
    void setToThree(MouseEvent event)throws IOException {
        rate = 3;
        toRating();
    }

    @FXML
    void setToTwo(MouseEvent event) throws IOException{
        rate = 2;
        toRating();
    }

    @FXML
    void setToOne(MouseEvent event) throws IOException {
        rate = 1;
        toRating();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ratePreview.setText(String.valueOf(rate));
        if(showRateCondition()) {
            rateDisplay.setText(String.valueOf(Account.getLoggedAccount().getGivesApp().get(Account.getLoggedAccount().getGivesApp().size() - 1)));
        }
    }

    public Boolean showRateCondition(){
        return Account.getLoggedAccount().getGivesApp().size() > 0;
    }

}

