package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Random;

public class Main extends Application {
    static Stage window;
    static Scene s1;
    static Scene s2;
    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Click The Button!");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

    }



    public static void main(String[] args) {
        launch(args);
    }
}
