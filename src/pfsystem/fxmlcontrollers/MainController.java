package pfsystem.fxmlcontrollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import pfsystem.Main;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

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
        main.changeScene("DeactivateScreen","deactivate",false,600,263);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //TODO add text here
    }
}
