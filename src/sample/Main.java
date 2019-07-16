package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    Color colors[]= new Color[]{Color.rgb(144, 172, 192), Color.rgb(144, 177, 199), Color.rgb(175, 172, 192), Color.rgb(175, 179, 199), Color.rgb(206, 172, 192), Color.rgb(206, 179, 199), Color.rgb(237, 172, 192), Color.rgb(237, 179, 199), Color.rgb(255, 172, 192), Color.rgb(255, 179, 199)};

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275,colors[1]));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
