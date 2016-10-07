package tetris;

import tetris.Cellule;

public class Piece 
{
    private static final int screenWidth = 500;
    private static final int screenHeight = 500;
    private static final int mouvVertical = 25;
    private static final int mouvLateral = 25;
    
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
