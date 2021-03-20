package pfsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pfsystem.utils.database.DataBaseCreator;
import pfsystem.utils.generators.CardIDgenerator;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        DataBaseCreator creator = new DataBaseCreator();
        creator.createInitFiles();

        Parent root = FXMLLoader.load(getClass().getResource("fxml/main.fxml"));
        primaryStage.setTitle("Home Page");
        primaryStage.centerOnScreen();
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 1200, 800));
        primaryStage.show();
    }

    public void changeScene(String sceneName, String titleName, boolean resize, int w, int h) throws IOException {
        Stage stg = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("fxml/" + sceneName + ".fxml"));
        stg.setTitle(titleName);
        stg.centerOnScreen();
        stg.setResizable(resize);
        stg.setScene(new Scene(root,w,h));
        stg.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
