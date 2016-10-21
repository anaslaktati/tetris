package tetris;

import tetris.Piece;
import java.math.*;
import java.util.Random;


public class Fabrique {

    Piece piece;
    int[][] tab ;
    int[][] Pfab;
//    int rnd = Math.round((float) Math.random());
    Random rand = new Random();
    int nombreAleatoire = rand.nextInt(7 - 1 + 1) + 1;
    //rand.nextInt(max - min +1 ) + min;
    
    public Fabrique() {
        tab = new int[4][16];
    }
    
    //genere une piece en fonction de nombreAleatoire
    public int[][] generate(){
        switch(this.nombreAleatoire){
            case 1:
                Pfab = creerCarre();
                return Pfab;
            case 2:
                Pfab = creerBatonVertical();
                return Pfab;
            case 3:
                Pfab = creerBaton1();
                return Pfab;
            case 4:
                Pfab = creeBaton2();
                return Pfab;
            case 5:
                Pfab = creerPieceT();
                return Pfab;
            case 6:
                Pfab = creerPieceJ();
                return Pfab;
            case 7:
                Pfab = creerPieceL();
                return Pfab;
            default:
                    System.out.println("erreur");
        }
        return null;
    }
    
    
    
    // les differentes pieces du jeu
    public int[][] creerCarre(){
        int[][] PieceCarre = { {0,0,4,0,0,4,4,0,0,4,0,0,0,0,0,0},
                                    {0,0,0,0,0,4,4,0,0,0,4,4,0,0,0,0},
                                        {0,0,4,0,0,4,4,0,0,4,0,0,0,0,0,0},
                                    {0,0,0,0,0,4,4,0,0,0,4,4,0,0,0,0} };
        
        return PieceCarre;      
    }
    
    public int[][] creerBatonVertical(){
        int[][] PieceVertical = { {0,3,0,0,0,3,0,0,0,3,0,0,0,3,0,0},
                                    {3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0},
                                    {0,3,0,0,0,3,0,0,0,3,0,0,0,3,0,0},
                                    {3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0} };
    
        return PieceVertical;
    };
    public int[][] creerBaton1(){
        int [][] PieceBaton1 = { {0,1,0,0,0,1,1,0,0,0,1,0,0,0,0,0},
                                {0,0,0,0,0,0,1,1,0,1,1,0,0,0,0,0},
                                {0,1,0,0,0,1,1,0,0,0,1,0,0,0,0,0},
                                {0,0,0,0,0,0,1,1,0,1,1,0,0,0,0,0} };
        return PieceBaton1;
    }
    
    public int[][] creeBaton2(){
        int[][] PieceBaton2 = {{0,2,2,0,0,2,2,0,0,0,0,0,0,0,0,0},
                                {0,2,2,0,0,2,2,0,0,0,0,0,0,0,0,0},
                                {0,2,2,0,0,2,2,0,0,0,0,0,0,0,0,0},
                                {0,2,2,0,0,2,2,0,0,0,0,0,0,0,0,0} };
        return PieceBaton2;
    }
    public int[][] creerPieceT(){
        int[][] PieceT = { {0,5,0,0,0,5,5,0,0,5,0,0,0,0,0,0},
                                {0,0,0,0,0,0,5,0,0,5,5,5,0,0,0,0},
                                {0,0,0,5,0,0,5,5,0,0,0,5,0,0,0,0},
                                {0,5,5,5,0,0,5,0,0,0,0,0,0,0,0,0} }; 
        return PieceT;
    }
    
    public int[][] creerPieceJ(){
        int[][] PieceJ = { {0,0,6,0,0,0,6,0,0,6,6,0,0,0,0,0},
                                {0,0,0,0,0,6,6,6,0,0,0,6,0,0,0,0},
                                {0,6,6,0,0,6,0,0,0,6,0,0,0,0,0,0},
                                {0,0,0,0,0,6,0,0,0,6,6,6,0,0,0,0} }; 
        return PieceJ;
    }
    
    public int[][] creerPieceL(){
        int[][] PieceL =  { {0,7,0,0,0,7,0,0,0,7,7,0,0,0,0,0},
                                {0,0,0,0,0,0,0,7,0,7,7,7,0,0,0,0},
                                {0,7,7,0,0,0,7,0,0,0,7,0,0,0,0,0},
                                {0,0,0,0,0,7,7,7,0,7,0,0,0,0,0,0} }; 
        return PieceL;
    }
    
}
