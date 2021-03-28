package pfsystem.fxmlcontrollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import pfsystem.utils.constants.Constants;
import pfsystem.utils.database.DataBaseCreator;
import java.io.File;

public class DeactivateController {

    @FXML
    public javafx.scene.control.Label mLabel;

    public void deactivate(ActionEvent event) {
        DataBaseCreator.deleteFile(new File(Constants.Paths.p_cardIDPath));
        DataBaseCreator.deleteFile(new File(Constants.Paths.p_typePath));
        DataBaseCreator.deleteFile(new File(Constants.Paths.p_cardNamePath));
        DataBaseCreator.deleteFile(new File(Constants.Paths.p_cardDatePath));
        mLabel.setText(Constants.Messages.m_confirmDeactivate);
    }
}
