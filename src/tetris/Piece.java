package tetris;

public class Piece 
{
    private int[][] tabpiece = new int[4][4];
    private int posX;
    private int posY;
    private Plateau plat;
    private Fabrique fab=new Fabrique();
        
    public Piece()
    {
        this.tabpiece = fab.creerCarre();
        this.posX = 0;
        this.posY = 0;
    }

//    public Piece(int[][] tabpiece,int posX, int posY) {
//        this.tabpiece = tabpiece;
//        this.posX = posX;
//        this.posY = posY;
//    }
    
    
    
    
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

    @Override
    public String toString() {
        return "Piece{" + "tabpiece=" + tabpiece + ", posX=" + posX + ", posY=" + posY + '}';
    }
    
    
    
    
    
}
