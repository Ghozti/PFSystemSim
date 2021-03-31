package pfsystem.fxmlcontrollers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myCard.setText(DataBaseCreator.getFileText(Constants.Paths.p_typePath));
        myName.setText(DataBaseCreator.getFileText(Constants.Paths.p_cardNamePath));
        cardID.setText(DataBaseCreator.getFileText(Constants.Paths.p_cardIDPath));
        massageAvailable.setText(DataBaseCreator.getFileText(Constants.Paths.p_typePath).trim().equals("Black Card") ? "yes" : "no");
    }
}
