package tetris;

import tetris.Piece;
import java.math.*;


public class Fabrique {

    Piece piece;
    int[][] tab ;
//    int rnd = Math.round((float) Math.random());
    
    public Fabrique() {
        tab = new int[4][16];
        
    }
    
    public int[][] creerCarre(){
        int[][] PieceCarre = { {0,0,4,0,0,4,4,0,0,4,0,0,0,0,0,0},
                                    {0,0,0,0,0,4,4,0,0,0,4,4,0,0,0,0},
                                        {0,0,4,0,0,4,4,0,0,4,0,0,0,0,0,0},
                                    {0,0,0,0,0,4,4,0,0,0,4,4,0,0,0,0} };
        //this.piece = new Piece(PieceCarre,0,0);
        
        return PieceCarre;      
    }
    
    
    
    
}
