package dungeon;

public class Character {
    private int x;
    private int y;
    private int movesLeft;

    public Character(int movesLeft){
        this.x = 0;
        this.y = 0;
        this.movesLeft = movesLeft;
    }

    public int getMovesLeft() {
        return movesLeft;
    }

    public String getPosition(){
        return x + ", " + y;
    }

    public void move(char c, Dungeon dungeon){
        if(c == 'w'){
            this.y--;
            this.movesLeft--;
            if(this.y < 0){
                y = 0;
            }
        }
        if(c == 's'){
            this.y++;
            this.movesLeft--;
            if(y > dungeon.getHeight() - 1){
                y = dungeon.getHeight() - 1;
            }
        }
        if(c == 'a'){
            this.x--;
            this.movesLeft--;
            if(this.x < 0){
                x = 0;
            }
        }
        if(c == 'd'){
            this.x++;
            this.movesLeft--;
            if(this.x > dungeon.getLength() - 1){
                x = dungeon.getLength() - 1;
            }
        }
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void decreaseMoves(){
        this.movesLeft--;
    }
}
