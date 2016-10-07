package tetris;

public class Cellule {
    
    String nom; //couleur en ode graph
    int x,y; // coordonnées

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
    
  
}
