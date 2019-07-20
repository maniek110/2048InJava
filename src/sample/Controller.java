package sample;

import javafx.stage.Stage;

public class Controller {

    //Actual state
    private State state;
    //Input Directions
    private boolean up,down,left,right,restart;

    private GameView gameView;

    public Controller(){
        state=State.Play;
        up=down=left=right=restart=false;
        gameView=new GameView();
    }
    public void Start(){

    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Stage getStage() {
        return gameView.getStage();
    }
}
