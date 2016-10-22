package tetris;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Cellule extends JPanel{
    
    String nom; //couleur en mode graph
    int x,y; // coordonnées
    //instance plateau
    Plateau plat;
    //instance piece
    Piece piece[][];
    //dimenssion de l'interface
    int dimension = 400;
    //nombre de lines de jeu
    int nbLines = 22;
    //nombre de colonnes
    int nbColonnes = 10;
    
    
    Timer timer;
    boolean isStarted = false;
    boolean isPaused = false ;
//    JLabel status;
    int linesSupp = 0;

    
    public Cellule(Plateau plat){
        setFocusable(true);
        setPreferredSize(new Dimension(dimension/2  , dimension));
        setBackground(Color.red);
        this.plat = plat;
        this.piece = new Piece[nbLines][nbColonnes];
//        timer = new Timer(400, this);
//        timer.start(); 
        
//        status = plat.getStatus();
        
    }
    
    public Cellule(String nom, int x, int y) {
        this.nom = nom;
        this.x = x;
        this.y = y;
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(1, 1, 1, 1);
    }

    public String getNom() {
        return nom;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
   
}