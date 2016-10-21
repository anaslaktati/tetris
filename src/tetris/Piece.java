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
        this.tabpiece = fab.generate();
        this.posX = 0;
        this.posY = 0;
    }

    
    String afficherTab(){
        String ret ="";
        for(int i=0;i<4;i++){
            ret += "{";
            for(int j=0;j<16;j++){
                ret+= tabpiece[i][j]+",";
            }
        ret += "}";    
        }
        return ret;
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

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    @Override
    public String toString() {
        return "Piece{" + "tabpiece=" + afficherTab() + ", posX=" + posX + ", posY=" + posY + '}';
    }
    
    
    
    
    
}
