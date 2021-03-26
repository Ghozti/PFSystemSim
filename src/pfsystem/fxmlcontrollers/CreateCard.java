package pfsystem.fxmlcontrollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import pfsystem.structure.cards.BlackCard;
import pfsystem.structure.cards.WhiteCard;
import pfsystem.structure.user.User;
import pfsystem.utils.constants.Constants;
import pfsystem.utils.database.DataBaseCreator;
import pfsystem.utils.generators.CardIDgenerator;
import java.io.File;
import java.io.FileNotFoundException;

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
    Label fieldLabels;

    //TODO optimize code, COMMENT COMMENT COMMENT COMMENT COMMENT COMMENT COMMENT COMMENT COMMENT EVERYWHERE thank you :)

    @FXML
    public void createCard(ActionEvent actionEvent) throws FileNotFoundException {

        //sets the user's field values
        User.setName(nameField.getText());
        User.setBday(dateField.getText());

        //will check if the radio button is selected if so then it will create a black card object
        if (optionRadio.isSelected()){
            User.setCard(new BlackCard(CardIDgenerator.cardIDGenerator()));
        }else {
            User.setCard(new WhiteCard(CardIDgenerator.cardIDGenerator()));
        }

        if (textEmpty(nameField.getText()) || textEmpty(dateField.getText())) {
            fieldLabels.setText(Constants.Errors.e_EmptyFields);
            return;
        }

        /**writes into the text files**/
        DataBaseCreator.writeFile(new File(Constants.Paths.p_cardIDPath),User.getCardID());
        DataBaseCreator.writeFile(new File(Constants.Paths.p_cardNamePath),User.getName());
        DataBaseCreator.writeFile(new File(Constants.Paths.p_cardDatePath),User.getDate());

        //once the car is created the label will display the card's ID
        label.setText(Constants.Messages.m_createCardLabel + "" + User.getCardID());
    }

    //will check to see if the given text is empty
    private boolean textEmpty(String str){
        if (str.isEmpty() || str.isBlank() || str == null){
            return true;
        }
        return false;
    }
}
