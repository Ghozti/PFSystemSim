package pfsystem.fxmlcontrollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import pfsystem.structure.user.User;
import pfsystem.utils.constants.Constants;
import pfsystem.utils.database.DataBaseCreator;

import java.net.URL;
import java.util.ResourceBundle;

public class AccountViewer implements Initializable {

    @FXML
    Label myCard;

    @FXML
    Label myName;

    @FXML
    Label cardID;

    @FXML
    Label massageAvailable;

    @FXML
    public void checkOut(ActionEvent actionEvent) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myCard.setText(User.getCard().canHaveGuest ? "Black Card" : "White Card");
        myName.setText(DataBaseCreator.getFileText(Constants.Paths.p_cardNamePath));
        cardID.setText(DataBaseCreator.getFileText(Constants.Paths.p_cardIDPath));
    }
}
