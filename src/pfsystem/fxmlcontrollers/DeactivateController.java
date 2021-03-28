package pfsystem.fxmlcontrollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import pfsystem.utils.constants.Constants;
import pfsystem.utils.database.DataBaseCreator;

import java.awt.*;
import java.io.File;

public class DeactivateController {

    @FXML
    Label confirmLabel;

    public void deactivate(ActionEvent event) {
        DataBaseCreator.deleteFile(new File(Constants.Paths.p_cardIDPath));
        DataBaseCreator.deleteFile(new File(Constants.Paths.p_typePath));
        DataBaseCreator.deleteFile(new File(Constants.Paths.p_cardNamePath));
        DataBaseCreator.deleteFile(new File(Constants.Paths.p_cardDatePath));
        confirmLabel.setText(Constants.Messages.m_confirmDeactivate);
    }
}
