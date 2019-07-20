package sample;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GameView {
    private Stage stage;
    Group group;
    Scene scene;
    Pane pane;
    GridPane gridPane;
    StackPane stackPane;
    Color colors[]= new Color[]{Color.rgb(144, 172, 192), Color.rgb(144, 177, 199), Color.rgb(175, 172, 192), Color.rgb(175, 179, 199), Color.rgb(206, 172, 192), Color.rgb(206, 179, 199), Color.rgb(237, 172, 192), Color.rgb(237, 179, 199), Color.rgb(255, 172, 192), Color.rgb(255, 179, 199)};
    Tile[][] grid;
    public GameView(){
        stage=new Stage();
        stage.setTitle("Hello World");
        pane=new Pane();
        pane.setStyle("-fx-background-color: antiquewhite");
        pane.setPrefSize(20,30);
        stackPane=new StackPane();
        gridPane=new GridPane();
        group=new Group();
        scene=new Scene(group,20,30);
        scene.setFill(Color.ANTIQUEWHITE);

        //render();
    }

    public Stage getStage() {
        return stage;
    }
}
