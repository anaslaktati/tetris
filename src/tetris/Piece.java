package tetris;

import tetris.*;

public class Piece 
{
    private int posX;
    private int posY;
        
    public Piece()
    {
        this.posX = 0;
        this.posY = 0;
    }
    
    public void versLeBas()
    {
        this.posY += mouvVertical;
    }
    public void versLaGauche()
    {
        this.posX -= mouvLateral;
    }
    public void versLaDroite()
    {
        this.posX += mouvLateral;
    }
}
