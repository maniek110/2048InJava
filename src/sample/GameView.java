package sample;

import javafx.scene.Group;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GameView {
    private Stage stage;
    Group group;
    Pane pane;
    GridPane gridPane;
    StackPane stackPane;
    Color colors[]= new Color[]{Color.rgb(144, 172, 192), Color.rgb(144, 177, 199), Color.rgb(175, 172, 192), Color.rgb(175, 179, 199), Color.rgb(206, 172, 192), Color.rgb(206, 179, 199), Color.rgb(237, 172, 192), Color.rgb(237, 179, 199), Color.rgb(255, 172, 192), Color.rgb(255, 179, 199)};
    Tile[][] grid;
    public GameView(){

    }

    public Stage getStage() {
    }
}
