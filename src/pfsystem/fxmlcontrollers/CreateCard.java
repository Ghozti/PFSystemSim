package pfsystem.fxmlcontrollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class CreateCard {

    @FXML
    TextField nameField;

    @FXML
    TextField dateField;

    @FXML
      Label label;

    boolean black = false;

    @FXML
    public void createCard(ActionEvent actionEvent) {

    }

    public void blackCardSelected() {
       black = true;
    }
}
