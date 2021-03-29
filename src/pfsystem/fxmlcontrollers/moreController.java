package pfsystem.fxmlcontrollers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;

public class moreController implements Initializable {

    @FXML
    Label moreLbl;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //TODO think of what to put here
        moreLbl.setText("");
    }
}
