package pfsystem.fxmlcontrollers;

import javafx.event.ActionEvent;
import pfsystem.utils.constants.Constants;
import pfsystem.utils.database.DataBaseCreator;

import java.io.File;

public class DeactivateController {

    public void deactivate(ActionEvent event) {
        DataBaseCreator.deleteFile(new File(Constants.Paths.p_cardIDPath));
    }
}
