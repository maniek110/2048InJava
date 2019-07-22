package sample;

import com.sun.javafx.geom.RectangularShape;
import com.sun.javafx.geom.RoundRectangle2D;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GameView {
    private Stage stage;
    Group group;
    Scene scene;
    Pane pane;
    State state;
    StackPane stackPane;
    Color colors[]= new Color[]{Color.rgb(144, 172, 192), Color.rgb(144, 177, 199), Color.rgb(175, 172, 192), Color.rgb(175, 179, 199), Color.rgb(206, 172, 192), Color.rgb(206, 179, 199), Color.rgb(237, 172, 192), Color.rgb(237, 179, 199), Color.rgb(255, 172, 192), Color.rgb(255, 179, 199)};
    Tile[][] grid;
    public GameView(){
        stage=new Stage();
        stage.setTitle("Hello World");
        pane=new Pane();
        pane.setStyle("-fx-background-color: antiquewhite");
        pane.setPrefSize(200,300);
        stackPane=new StackPane();
        group=new Group();
        scene=new Scene(group,200,300);
        scene.setFill(Color.ANTIQUEWHITE);

        stage.setScene(scene);

        render();
    }

    private void render() {
        state=Controller.getState();
        
        switch (state){
            case Start:
                Start();
                break;
            case End:
                Finish();
                break;
            case Play:
                Run();
                break;
            case Win:
                Win();
                break;
        }
        
    }

    private void Win() {
    }

    private void Run() {
        Rectangle rectangle=new Rectangle(0,0,scene.getWidth(),200);
        rectangle.setArcHeight(20);
        rectangle.setArcWidth(20);
        rectangle.setFill(Color.BLUE);
        stackPane.setPrefSize(scene.getWidth(),scene.getHeight());
        stackPane.getChildren().add(rectangle);
        stackPane.setAlignment(rectangle, Pos.BOTTOM_CENTER);
        scene.setRoot(stackPane);
        stage.setScene(scene);
    }

    private void Finish() {
    }

    private void Start() {
        group=new Group();
        Text Title=new Text(scene.getWidth()/5,scene.getHeight()/3,"2048");
        Title.setFill(Color.BLUE);
        group.getChildren().add(Title);
        scene.setRoot(group);
        stage.setScene(scene);
    }

    public Stage getStage() {
        return stage;
    }
}
