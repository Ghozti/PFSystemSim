package pfsystem.fxmlcontrollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pfsystem.Main;
import java.io.IOException;


public class CheckInController {

    @FXML
    TextField cardIDgetter;

    @FXML
    Label errLabel;

    @FXML
    public void checkIn(ActionEvent actionEvent) {
    }

    @FXML
    public void changeScreenToCardCreator(ActionEvent actionEvent) throws IOException {
        Main main = new Main();
        main.changeScene("CreateCard", "Card Creator", false, 600,400);
    }

    @FXML
    public void importData(ActionEvent event) {
        try {

        }catch (Exception e){

        }
    }
}
