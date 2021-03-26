package pfsystem.fxmlcontrollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pfsystem.Main;
import pfsystem.utils.constants.Constants;
import pfsystem.utils.database.DataBaseCreator;
import java.io.IOException;


public class CheckInController {

    @FXML
    TextField cardIDgetter;

    @FXML
    Label errLabel;

    @FXML
    Label inputErrLabel;

    @FXML
    public void checkIn(ActionEvent actionEvent) {
        if (DataBaseCreator.getFileText(Constants.Paths.p_cardIDPath).equals(cardIDgetter.getText())){
            //TODO switch screen to card viewer
        }else {
            inputErrLabel.setText(Constants.Errors.e_WrongData);
        }
    }

    @FXML
    public void changeScreenToCardCreator(ActionEvent actionEvent) throws IOException {
        Main main = new Main();
        main.changeScene("CreateCard", "Card Creator", false, 600,400);
    }

    @FXML
    public void importData(ActionEvent event) {
        cardIDgetter.setText(DataBaseCreator.getFileText(Constants.Paths.p_cardIDPath));
    }
}
