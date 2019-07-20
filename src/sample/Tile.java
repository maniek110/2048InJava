package sample;

public class Tile {
    private int value;//value of the field

    Tile(int x){
        value=x;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean CanBeMerged(Tile tile){
        return value==tile.value;
    }
    public int mergeThat(Tile tile){
        if(CanBeMerged(tile)){
            value*=2;
            return value;
        }
        return -1;
    }

}
