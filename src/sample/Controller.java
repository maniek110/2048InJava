package sample;

public class Controller {

    //Actual state
    static State state;
    //Input Directions
    private boolean up,down,left,right,restart;

    public Controller(){
        state=State.Play;
        up=down=left=right=restart=false;
    }
}
