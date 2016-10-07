package tetris;

public class Plateau 
{
    private static final int screenSize = 500;
    private static final int mouvVertical = 25;
    private static final int mouvLateral = 25;
    
    public int getScreenSize()
    {
        return this.screenSize;
    }

    public int getMouvVertical()
    {
        return this.mouvVertical;
    }

    public int getMouvLateral()
    {
        return this.mouvLateral;
    }    
}
