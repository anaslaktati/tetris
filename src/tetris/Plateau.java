package tetris;

public class Plateau 
{
    private static final int screenWidth = 500;
    private static final int screenHeight = 500;
    private static final int mouvVertical = 25;
    private static final int mouvLateral = 25;
    
    public int getScreenWidth()
    {
        return this.screenWidth;
    }

    public int getScreenHeight()
    {
        return this.screenHeight;
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
