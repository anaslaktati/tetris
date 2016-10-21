package tetris;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.Parent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import tetris.Plateau;

public class Cellule extends JPanel implements ActionListener {
    
    String nom; //couleur en ode graph
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
    JLabel status;
    int linesSupp = 0;

    
    public Cellule(Plateau plat){
        setFocusable(true);
        this.plat = plat;
        this.piece = new Piece[nbLines][nbColonnes];
        timer = new Timer(400, this);
        timer.start(); 
        
        status = plat.getStatus();
        setPreferredSize(new Dimension(dimension/2  , dimension));
        setBackground(Color.gray);
        
    }
    
    public Cellule(String nom, int x, int y) {
        this.nom = nom;
        this.x = x;
        this.y = y;
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
    
    private void pause() {
        if (!isStarted)
            return;

        isPaused = !isPaused;
        if (isPaused) {
            timer.stop();
            status.setText("paused");
        } else {
            timer.start();
            status.setText(String.valueOf(linesSupp));
        }
        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
  
}
