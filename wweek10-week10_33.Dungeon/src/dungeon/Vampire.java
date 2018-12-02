package dungeon;


public class Vampire {
    private int x;
    private int y;

    public Vampire(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String getPosition(){
        return x + ", " + y;
    }

    public void moveUp(){
        this.y--;
    }

    public void moveDown(){
        this.y++;
    }

    public void moveLeft(){
        this.x--;
    }

    public void moveRight(){
        this.x++;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}
