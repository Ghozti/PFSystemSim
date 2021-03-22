package pfsystem.fxmlcontrollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import pfsystem.structure.cards.BlackCard;
import pfsystem.structure.cards.Card;
import pfsystem.structure.cards.WhiteCard;
import pfsystem.utils.generators.CardIDgenerator;


public class CreateCard {

    @FXML
    TextField nameField;

    @FXML
    TextField dateField;

    @FXML
      Label label;

    @FXML
    RadioButton optionRadio;

    @FXML
    public void createCard(ActionEvent actionEvent) {
        if (optionRadio.isSelected()){
            Card card = new BlackCard(CardIDgenerator.cardIDGenerator());
        }else {
            Card card = new WhiteCard(CardIDgenerator.cardIDGenerator());
        }

    }
}
