package pfsystem.fxmlcontrollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import pfsystem.Main;

import java.io.IOException;

public class MainController {

    private Main main = new Main();

    @FXML
    public void accountView(ActionEvent actionEvent) throws IOException {
        main.changeScene("CheckIn","Account viewer",false,600,400);
    }

    @FXML
    public void moreView(ActionEvent actionEvent) throws Exception {
        main.changeScene("more","more",false,600,400);
    }

    @FXML
    public void deactivateView(ActionEvent actionEvent) throws IOException {
        main.changeScene("DeactivateScreen","deativate",false,600,263);
    }
}
