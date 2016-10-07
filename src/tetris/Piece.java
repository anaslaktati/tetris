package tetris;

import tetris.*;

public class Piece 
{
    private int[][] tabpiece = new int[4][4];
    private int posX;
    private int posY;
    private Plateau plat;
    private Fabrique fab;
        
    public Piece()
    {
        
        this.posX = 0;
        this.posY = 0;
    }
    
    public void versLeBas()
    {
        this.posY += plat.getMouvement();
    }
    public void versLaGauche()
    {
        this.posX -= plat.getMouvement();
    }
    public void versLaDroite()
    {
        this.posX += plat.getMouvement();
    }
}
