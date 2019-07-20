package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Controller controller=new Controller();
        GameView gameView=new GameView();
        primaryStage=gameView.getStage();
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
