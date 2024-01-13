package exercices1_2_3;

public class PointNom extends Point {
    private String nom;
    
    public PointNom(int x, int y, String nom) 
    {
        super(x, y);
        this.nom = nom;
    }
    public void setPointNom(int x, int y, String nom) {
        super.setPoint(x, y);
        this.nom = nom;
    }
    public void setNom(String nom) {
    this.nom = nom;
    }
    public void affCoordNom() {
        System.out.println("Coordonnées du point " + nom + " : (" + getX() + ", " + getY() + ")");
    }
}