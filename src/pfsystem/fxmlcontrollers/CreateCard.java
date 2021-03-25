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

    //TODO optimize code

    @FXML
    public void createCard(ActionEvent actionEvent) throws FileNotFoundException {
        if (optionRadio.isSelected()){
            User.setCard(new BlackCard(CardIDgenerator.cardIDGenerator()));
            User.setName(nameField.getText());
            User.setBday(dateField.getText());
        }else {
            User.setCard(new WhiteCard(CardIDgenerator.cardIDGenerator()));
            User.setName(nameField.getText());
            User.setBday(dateField.getText());
        }

        if (textEmpty(nameField.getText()) || textEmpty(dateField.getText())) {
            fieldLabels.setText(Constants.e_EmptyFields);
            return;
        }

        DataBaseCreator.writeFile(new File(Constants.p_cardIDPath),User.getCardID());
        DataBaseCreator.writeFile(new File(Constants.p_cardNamePath),User.getName());
        DataBaseCreator.writeFile(new File(Constants.p_cardDatePath),User.getDate());
        label.setText(Constants.m_createCardLabel + "" + User.getCardID());
    }

    public boolean textEmpty(String str){
        if (str.isEmpty() || str.isBlank() || str == null){
            return true;
        }
        return false;
    }
}
